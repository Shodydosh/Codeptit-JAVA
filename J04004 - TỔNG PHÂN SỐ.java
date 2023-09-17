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

    PhanSo Add(PhanSo other){
        PhanSo c = new PhanSo();
        long x = a * other.b + other.a * b;
        long y = b * other.b;
        c.a = x;
        c.b = y;
        return c;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a.Input(); b.Input();
        PhanSo c = a.Add(b);
        c.Compact();
        c.Output();
    }
}
