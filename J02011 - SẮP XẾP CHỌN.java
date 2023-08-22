import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < t - 1; i++) {
            int tmp = a[i];
            int id = i;
            for (int j = i + 1; j < t; j++) {
                if (a[id] > a[j]) {
                    id = j;
                }
            }
            a[i] = a[id];
            a[id] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int p = 0; p < t; p++) System.out.print(a[p] + " ");
            System.out.println();
        }
    }

}
