import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            Set<Integer> mergedSet = new HashSet<>();

            // Read and add elements from array A to mergedSet
            for (int i = 0; i < m; i++) {
                int num = scanner.nextInt();
                mergedSet.add(num);
            }

            // Read and add elements from array B to mergedSet
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                mergedSet.add(num);
            }

            // Convert the mergedSet to an int array
            int[] mergedArray = new int[mergedSet.size()];
            int index = 0;
            for (int num : mergedSet) {
                mergedArray[index++] = num;
            }

            // Sort the mergedArray (if needed)
            Arrays.sort(mergedArray);
            for (int num : mergedArray) {
                System.out.print(num + " ");
            }
    }
}
