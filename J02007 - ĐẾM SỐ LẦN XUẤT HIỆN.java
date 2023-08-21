import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int test = 1;
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) a[i] = scanner.nextInt();
            int[] cnt = new int[100005];
            for(int i=0; i<n; i++) cnt[a[i]]++;
            int[] vs = new int[100005];
            System.out.println("Test " + test++ + ":");
            for(int i=0; i<n; i++){
                if(vs[a[i]] == 0){
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                    vs[a[i]] = 1;
                }
            }
        }
    }
}
