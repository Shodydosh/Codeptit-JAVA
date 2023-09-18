import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static boolean check(Long n){
        long tmp = (long)Math.sqrt(n);
        return tmp * tmp == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
