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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        int step = 1;
        int chk;
        for (int i = 0; i < n; i++) {
            chk = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Hoán đổi hai phần tử nếu cần
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    chk = 1;
                    // In ra dãy sau mỗi bước
                }
            }
            if(chk == 1){
                System.out.print("Buoc " + step++ + ": ");
                for (int k = 0; k < n; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }

}
