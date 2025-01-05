import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();

        int[] d = new int[m];
        for (int i = 0; i < m; i++) {
            d[i] = scanner.nextInt();
        }

        int totalDays = 0;
        for (int i = 0; i < m; i++) {
            totalDays += d[i];
        }

        int median = (totalDays + 1) / 2;

        int sum = 0;
        int a = 1;

        for (int i = 0; i < m; i++) {
            if (sum + d[i] < median) {
                sum += d[i];
            } else {
                a = i + 1;
                break;
            }
        }

        int b = 0;
        while (sum < median) {
            b++;
            sum++;
        }

        System.out.println(a + " " + b);
    }
}
