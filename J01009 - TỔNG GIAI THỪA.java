import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static long solve(int n) {
        long res = 0;
        for(int i=1; i<=n; i++){
            long tmp = 1;
            for(int j=1; j<=i; j++){
                tmp *= j;
            }
            res += tmp;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
