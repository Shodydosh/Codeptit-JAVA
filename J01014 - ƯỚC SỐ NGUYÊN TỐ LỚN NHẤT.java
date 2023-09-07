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
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long tmp = n;
            for(long i=2; i<=Math.sqrt(n); i++){
                if(n%i ==0){
                    tmp = i;
                    while(n % i == 0) n/=i;
                }
            }
            if(n != 1) System.out.println(n);
            else System.out.println(tmp);
        }
    }
}
