import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static String solve(String s) {
        int k = 0, n = s.length();
        for (int i=0; i<=(n-1)/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i))
                k++;
        }
        if((n%2 == 0 && k == 1) || (n % 2 == 1 && k <= 1)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String tmp = scanner.nextLine();
        while (t-- > 0){
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }
}
