import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void solve(BigInteger n1, BigInteger n2) {
        BigInteger gcd = n1.gcd(n2);
        BigInteger lcm = n1.multiply(n2).divide(gcd);
        System.out.println(lcm + " " + gcd);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            BigInteger n = scanner.nextBigInteger(), m = scanner.nextBigInteger();
            solve(n, m);
        }
    }
}
