import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Long mod = 1000000007L;
    public static Long POW(long a, long b){
        if(b == 0) return 1L;
        Long tmp = POW(a, (b/2));
        tmp = (tmp * tmp) % mod;
        if (b % 2 == 0) return tmp;
        return (tmp * a) % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) return;
            else System.out.println(POW(a, b));
        }
    }
}
