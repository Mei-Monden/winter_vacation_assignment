import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStr = scanner.nextLine().split(" ");
        int n = inputStr.length;
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input[i] * (1L << i); 
        }

        System.out.println(sum);
    }
}
