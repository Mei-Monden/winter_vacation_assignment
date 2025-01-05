import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String p = input[0];
        String q = input[1];

        Map<String, Integer> values = new HashMap<>();
        values.put("A", 0);
        values.put("B", 3);
        values.put("C", 4);
        values.put("D", 8);
        values.put("E", 9);
        values.put("F", 14);
        values.put("G", 23);

        int result = Math.abs(values.get(p) - values.get(q));

        System.out.println(result);
    }
}
