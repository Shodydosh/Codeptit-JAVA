import java.io.*;
import java.util.*;

class PhanSo {
    long a, b;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        a = sc.nextLong();
        b = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", a, b);
    }

    void Compact() {
        long x = a;
        long y = b;
        while(x != 0){
            long tmp = x;
            x = y%x;
            y = tmp;
        }
        a /= y;
        b /= y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        PhanSo a = new PhanSo();
        a.Input();
        a.Compact();
        a.Output();
    }
}
