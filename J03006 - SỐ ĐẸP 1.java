import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static Boolean checkPal(String s) {
        StringBuilder reversedS = new StringBuilder(s);
        reversedS.reverse();
        return reversedS.toString().equals(s);
    }

    public static Boolean checkDigit(String s) {
        StringBuilder ss = new StringBuilder(s);
        for(int i=0; i<ss.length(); i++){
//            System.out.println(ss.charAt(i));
            if((ss.charAt(i)-'0') % 2 == 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(checkPal(s) && checkDigit(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
