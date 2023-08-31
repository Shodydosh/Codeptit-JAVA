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
        int k = scanner.nextInt();
        int s = 0;
        int a[] = new int[k+1];
        for (int i=1; i<=k; i++)
            a[i] = i;
        while (true){
            s ++;
            int ok = 0;
            for (int i=1; i<=k; i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            for (int i=k; i>=1; i--){
                if (a[i] != n-k+i){
                    ok = 1;
                    a[i]++;
                    for(int j = i+1; j<=k; j++){
                        a[j] = a[j-1] + 1;
                    }
                    break;
                }
            }
            if(ok == 0) break;
        }
        System.out.println();
        System.out.print("Tong cong co " + s + " to hop");
    }
}
