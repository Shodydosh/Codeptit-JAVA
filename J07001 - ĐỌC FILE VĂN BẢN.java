import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
