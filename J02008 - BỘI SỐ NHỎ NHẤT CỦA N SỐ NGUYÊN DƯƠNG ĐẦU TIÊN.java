import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static Long GCD(Long a, Long b) {
        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(b);
        BigInteger tmp = A.gcd(B);
        return tmp.longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            Long ans = 1L;
            for(Long i = 1L; i<=n; i++){
                ans = ans * i / GCD(ans, i);
            }
            System.out.println(ans);
        }
    }
}
