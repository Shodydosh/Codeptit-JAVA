import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1000];
        for(int i=0; i<100000; i++){
            a[dis.readInt()]++;
        }
        for(int i=0; i< 1000; i++){
            if(a[i] > 0)
                System.out.println(i + " " + a[i]);
        }
        dis.close();
    }
}
