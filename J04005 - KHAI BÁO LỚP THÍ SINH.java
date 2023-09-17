import java.io.*;
import java.util.*;

class Student {
    String name, dob;
    Double m1, m2, m3, M;
    Scanner sc = new Scanner(System.in);

    void Input() {
        name = sc.nextLine();
        dob = sc.nextLine();
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
        M = m1 + m2 + m3;
    }

    void Output() {
        System.out.println(name + ' ' + dob + ' ' + M);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.Input();
        s.Output();
    }
}
