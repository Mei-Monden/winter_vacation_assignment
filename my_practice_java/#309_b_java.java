import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] input = new char[n][n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine().toCharArray();
        }

        List<Character> outerRing = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            outerRing.add(input[0][i]);
        }
        for (int i = 1; i < n; i++) {
            outerRing.add(input[i][n - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            outerRing.add(input[n - 1][i]);
        }
        for (int i = n - 2; i >= 1; i--) {
            outerRing.add(input[i][0]);
        }

        Collections.rotate(outerRing, -1);

        int index = 0;
        for (int i = 0; i < n; i++) {
            input[0][i] = outerRing.get(index++);
        }
        for (int i = 1; i < n; i++) {
            input[i][n - 1] = outerRing.get(index++);
        }
        for (int i = n - 2; i >= 0; i--) {
            input[n - 1][i] = outerRing.get(index++);
        }
        for (int i = n - 2; i >= 1; i--) {
            input[i][0] = outerRing.get(index++);
        }

        for (char[] line : input) {
            System.out.println(new String(line));
        }
    }
}
