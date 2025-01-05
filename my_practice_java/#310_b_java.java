import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.nextLine();

        List<Map<String, Object>> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            int price = Integer.parseInt(data[0]);
            List<Integer> features = new ArrayList<>();
            for (int j = 2; j < data.length; j++) {
                features.add(Integer.parseInt(data[j]));
            }
            Map<String, Object> item = new HashMap<>();
            item.put("price", price);
            item.put("features", features);
            input.add(item);
        }

        String result = "No";

        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                int priceI = (int) input.get(i).get("price");
                int priceJ = (int) input.get(j).get("price");

                if (priceI >= priceJ) {
                    List<Integer> featuresI = (List<Integer>) input.get(i).get("features");
                    List<Integer> featuresJ = (List<Integer>) input.get(j).get("features");

                    if (featuresI.containsAll(featuresJ)) {
                        if (priceI > priceJ || !featuresJ.containsAll(featuresI)) {
                            result = "Yes";
                            break outer;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
