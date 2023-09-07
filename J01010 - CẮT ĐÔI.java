import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {

    public static String solve(String x) {
        StringBuilder ss = new StringBuilder(x);
        for(int i=0; i<ss.length(); i++){
            if(ss.charAt(i) == '1' || ss.charAt(i) == '0') continue;
            else if(ss.charAt(i) == '8' || ss.charAt(i) == '9')
                ss.setCharAt(i, '0');
            else {
                return "INVALID";
            }
        }
        int startIndex = 0;
        while (startIndex < ss.length() && (ss.charAt(startIndex) == '0')) {
            startIndex++;
        }
        if (startIndex == ss.length()) {
            return "INVALID";
        }
        else {
            ss.delete(0, startIndex);
            return ss.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String tmp = scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }
}
