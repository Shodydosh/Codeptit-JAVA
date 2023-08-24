import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int lenA = a.toString().length();
            int lenB = b.toString().length();
            int leng = Math.max(lenA, lenB);
            BigInteger ans = a.subtract(b).abs();
            int lenAns = ans.toString().length();
            for(int i=0; i<leng-lenAns; i++) System.out.print(0);
            System.out.println((ans));
        }
    }
}



