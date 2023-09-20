import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        char curr = s.charAt(s.length()-1);
        for(int i=s.length() - 1; i>=0; i--){
            if (s.charAt(i) == curr) {
                ans += s.charAt(i); // Append character to the beginning of ans
            } else if (s.charAt(i) > curr) {
                ans += s.charAt(i); // Append character to the beginning of ans
                curr = s.charAt(i); // Update curr
            }
        }
        StringBuilder reversed = new StringBuilder(ans).reverse();
        System.out.println(reversed.toString());
    }
}
