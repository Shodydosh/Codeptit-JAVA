import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static String solve(String s) {
        StringBuilder ss = new StringBuilder(s);
        int even = 0, odd = 0;
        if(ss.charAt(0) == '0') return "INVALID";
        for(int i=0; i<ss.length(); i++) {
            char c = ss.charAt(i);
            if (c > '9' || c < '0') return "INVALID";
            else {
                if((c - '0') % 2 == 0) even++;
                else odd++;
            }
        }
        if(odd > even) return "NO";
        else return "YES";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String tmp = scanner.nextLine();
        while(t-- > 0){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            if(a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
