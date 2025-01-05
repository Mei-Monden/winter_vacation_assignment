import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> c = new ArrayList<>();
        List<List<Integer>> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            c.add(Integer.parseInt(scanner.nextLine()));
            String[] arrayInput = scanner.nextLine().split(" ");
            List<Integer> array = new ArrayList<>();
            for (String s : arrayInput) {
                array.add(Integer.parseInt(s));
            }
            a.add(array);
        }

        int x = Integer.parseInt(scanner.nextLine());

        List<Integer> b = new ArrayList<>();
        int numberOfElements = 0;

        for (int index = 0; index < a.size(); index++) {
            List<Integer> array = a.get(index);
            if (array.contains(x)) {
                if (numberOfElements == 0) {
                    numberOfElements = array.size();
                    b.add(index + 1);
                } else if (numberOfElements > array.size()) {
                    b.clear();
                    b.add(index + 1);
                    numberOfElements = array.size();
                } else if (numberOfElements == array.size()) {
                    b.add(index + 1);
                }
            }
        }

        System.out.println(b.size());
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i));
            if (i < b.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
