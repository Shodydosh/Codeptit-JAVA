import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            Set<Integer> aSet = new HashSet<>();
            Set<Integer> bSet = new HashSet<>();

            // Đọc dãy số a và thêm vào tập hợp aSet
            for (int i = 0; i < m; i++) {
                int num = scanner.nextInt();
                aSet.add(num);
            }

            // Đọc dãy số b và thêm vào tập hợp bSet
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                bSet.add(num);
            }

            Set<Integer> intersection = new HashSet<>(aSet);
            intersection.retainAll(bSet);
            List<Integer> intersectionList = new ArrayList<>(intersection);
            Collections.sort(intersectionList);

            for (int num : intersectionList) {
                System.out.print(num + " ");
            }

//        }
    }
}
