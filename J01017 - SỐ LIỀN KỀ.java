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
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i) != (char)(s.charAt(i+1) - 1) && s.charAt(i) != (char)(s.charAt(i+1) + 1)){
                    chk = 0;
                    break;
                }
            }
            if(chk == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
