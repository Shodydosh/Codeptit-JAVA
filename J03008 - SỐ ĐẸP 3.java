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
        for(int i=0; i<s.length(); i++){
            if(ss.charAt(i) == '0' || ss.charAt(i) == '1') return false;
            if(ss.charAt(i) == '4' || ss.charAt(i) == '6') return false;
            if(ss.charAt(i) == '8' || ss.charAt(i) == '9') return false;
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
