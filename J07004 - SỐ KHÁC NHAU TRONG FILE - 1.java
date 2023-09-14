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
            int a[] = new int[1000];
            while(sc.hasNextInt()){
                a[sc.nextInt()]++;
            }
            for(int i=0; i<1000; i++){
                if(a[i] > 0)
                    System.out.println(i + " " + a[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
