import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7')
                ans++;
        }
        if(ans == 7 || ans == 4) System.out.println("YES");
        else System.out.println("NO");
    }
}
