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
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    a[i][j] = scanner.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                if(i % 2 == 0){
                    for(int j=0; j<n; j++){
                        System.out.print(a[i][j] + " ");
                    }
                }
                else {
                    for(int j=n-1; j>=0; j--){
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
