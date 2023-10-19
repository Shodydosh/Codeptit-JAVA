import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Pair<n1, n2> {
    n1 a;
    n2 b;
    public Pair(n1 a, n2 b){
        this.a = a;
        this.b = b;
    }

    public boolean check(int n){
        if(n < 2) return false;
        if(n < 4) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i=3; i<= Math.sqrt(n); i+=2){
            if(n % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime(){
        return check(Integer.parseInt(a.toString())) && check(Integer.parseInt(b.toString()));
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
