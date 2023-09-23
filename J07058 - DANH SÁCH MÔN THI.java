import java.io.*;
import java.text.*;
import java.util.*;

class monHoc implements Comparable<monHoc> {
    private String a, b, c;
    public monHoc(String a, String b, String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return a + " " + b + " " + c;
    }

    @Override
    public int compareTo(monHoc other){
        return this.a.compareTo(other.a);
    }
}

public class Main {
    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(new File("MONHOC.in")).useLocale(Locale.getDefault());
        int t = sc.nextInt();
        ArrayList<monHoc> a = new ArrayList<>();
        sc.nextLine();
        while(t-- > 0){
            a.add(new monHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        for (monHoc x : a) System.out.println(x);
    }
}
