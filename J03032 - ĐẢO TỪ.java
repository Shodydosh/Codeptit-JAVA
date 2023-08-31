import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String tmp = scanner.nextLine();
        while(t-- > 0){
            String s = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(s);
            while (tokenizer.hasMoreTokens()) {
                StringBuilder x = new StringBuilder(tokenizer.nextToken());
                System.out.print(x.reverse() + " ");
            }
            System.out.println();
        }
    }
}
