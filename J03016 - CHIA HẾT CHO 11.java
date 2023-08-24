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
            BigInteger c = new BigInteger("11");
            BigInteger k = a.divide(c);
            if(k.multiply(c).compareTo(a) == 0) System.out.println(1);
            else System.out.println(0);
        }
        sc.close();
    }
}



