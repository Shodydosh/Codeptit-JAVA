import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] check = new int[205];
        int maxVal = 0;
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
            if(a[i] > maxVal) maxVal = a[i];
            check[a[i]] = 1;
        }
        int chk = 1;
        for(int i=1; i<=maxVal; i++){
            if(check[i] == 0){
                chk = 0;
                System.out.println(i);
            }
        }
        if(chk == 1) System.out.println("Excellent!");
    }
}
