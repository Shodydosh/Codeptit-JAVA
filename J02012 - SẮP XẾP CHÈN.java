import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // If the current element is greater than the next one, the aay is not sorted
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        // If the loop completes without finding an unsorted pair, the aay is sorted
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vector<Integer> v = new Vector<>();
        for(int i=0; i<n; i++){
            int tmp = scanner.nextInt();
            v.add(tmp);
        }
        Vector<Integer> newV = new Vector<>();
        int step = 0;
        for(int a : v){
            newV.add(a);
            Collections.sort(newV);
            System.out.print("Buoc " + step++ + ": ");
            for(int x : newV) System.out.print(x + " ");
            System.out.println();
        }
    }

}
