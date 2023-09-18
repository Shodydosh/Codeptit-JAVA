import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static boolean check(Long n){
        long tmp = (long)Math.sqrt(n);
        return tmp * tmp == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxA = 0, maxB = 0, minA = 1000, minB = 1000;
        for(int i=0; i<4; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > maxA) maxA = a;
            if(b > maxB) maxB = b;
            if(a < minA) minA = a;
            if(b < minB) minB = b;
        }
        int tmp = maxA - minA;
        int tmp2 = maxB - minB;
        int ans = Math.max(tmp, tmp2);
        System.out.println(ans * ans);
    }
}
