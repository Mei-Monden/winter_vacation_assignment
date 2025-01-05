import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine();

        String[] schedule = new String[n];
        for (int i = 0; i < n; i++) {
            schedule[i] = scanner.nextLine();
        }

        int maxStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < d; i++) {
            boolean allOkay = true;

            for (int t = 0; t < n; t++) {
                if (schedule[t].charAt(i) != 'o') {
                    allOkay = false;
                    break;
                }
            }

            if (allOkay) {
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        System.out.println(maxStreak);
    }
}
