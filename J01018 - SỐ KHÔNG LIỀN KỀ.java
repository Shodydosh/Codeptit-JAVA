import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String tmp = sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int chk = 1;
            int ss = 0;
            for(int i=0; i<s.length()-1; i++){
                ss += (int)(s.charAt(i) - '0');
                if(s.charAt(i) != (char)(s.charAt(i+1) - 2) && s.charAt(i) != (char)(s.charAt(i+1) + 2)){
                    chk = 0;
                    break;
                }
            }
            ss += (int)(s.charAt(s.length()-1) - '0');
            if(chk == 1 && ss % 10 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
