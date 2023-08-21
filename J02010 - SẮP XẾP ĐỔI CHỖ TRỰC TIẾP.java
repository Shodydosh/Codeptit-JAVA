import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        int test = 1;
//        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) a[i] = scanner.nextInt();
            int step = 1;
            for(int i=0; i<n; i++){
                int chk = 1;
                for(int j=i+1; j<n; j++){
                    if(a[j] < a[i]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        chk = 0;
                    }
                }
                if(chk == 1) break;
                else {
                    System.out.print("Buoc " + step++ + ": ");
                    for(int num : a) System.out.print(num + " ");
                    System.out.println();
                }
            }
//        }
    }

}
