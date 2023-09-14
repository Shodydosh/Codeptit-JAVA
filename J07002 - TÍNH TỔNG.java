import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;
            while(sc.hasNext()){
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    sum += x;
                } else {
                    // If the next token is not an integer, skip it
                    sc.next();
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
