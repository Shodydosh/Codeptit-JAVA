import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String xx = sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int chk = 1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != '1' && s.charAt(i) != '0' && s.charAt(i) != '2'){
                    chk = 0;
                    break;
                }
            }
            if(chk == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
