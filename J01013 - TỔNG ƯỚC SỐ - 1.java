import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    static int[] a = new int[2000001];
    public static void erat() {
        int i;
        for(i=2; i * i <= 2000000; i++) {
            if (a[i] == 0)
                for (int j = i * i; j <= 2000000; j+=i) {
                    a[j] = i;
                }
        }
        for (i=2; i<= 2000000; i++){
            if(a[i] == 0)
                a[i] = i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        erat();
        Long s = 0L;
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            while(n!=1){
                s += a[n];
                n /= a[n];
            }
        }
        System.out.print(s);
    }
}
