import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] eaten = scanner.nextLine().split(" ");
        List<String> plate = Arrays.asList(scanner.nextLine().split(" "));
        int[] price = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int amount = 0;

        for (String color : eaten) {
            if (plate.contains(color)) {
                int index = plate.indexOf(color);
                amount += price[index + 1];
            } else {
                amount += price[0];
            }
        }

        System.out.println(amount);
    }
}
