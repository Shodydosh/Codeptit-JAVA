import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                if (sc.hasNextInt()) {
                    sc.next();
                } else {
                    // If the next token is not an integer, skip it
                    String x = sc.next();
                    vec.add(x);
                }
            }
            Collections.sort(vec);
            for (String s : vec)
                System.out.print(s + " ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
