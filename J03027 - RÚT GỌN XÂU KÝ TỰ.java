import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
    public static String solve(String s) {
        StringBuilder ss = new StringBuilder(s);
        while(true){
            Boolean ok = true;
            StringBuilder newS = new StringBuilder();
            for(int i =0 ; i< ss.length(); i++){
                if((i < ss.length()-1) && ss.charAt(i) == ss.charAt(i+1)) {
//                    System.out.println(ss.charAt(i) + " " + ss.charAt(i+1));
                    ok = false;
                    i++;
                }
                else {
                    newS.append(ss.charAt(i));
                }
            }
            ss = newS;
            if(ok) break;
        }
        if(!ss.toString().isEmpty()) return ss.toString();
        return "Empty String";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(solve(s));
    }
}
