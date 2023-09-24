import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {

    static boolean check(long n){
        if (n <= 3) return true;
        long a = 1, b = 1, c = 0;
        while(c < n){
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long tmp = 5L * n * n;
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
