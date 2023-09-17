import java.io.*;
import java.util.*;

class Student {
    String name, dob, msv;
    Double gpa;
    Scanner sc = new Scanner(System.in);

    void Input() {
        name = sc.nextLine();
        msv = sc.nextLine();
        dob = sc.nextLine();
        gpa = sc.nextDouble();
    }

    void Output() {
        StringBuilder ss = new StringBuilder(dob);
        if(ss.charAt(1) == '/'){
            ss.insert(0, '0');
        }
        if(ss.charAt(4) == '/'){
            ss.insert(3, '0');
        }
        System.out.print("B20DCCN001 ");
        System.out.print(name + ' ' + msv + ' ' + ss.toString() + ' ');
        System.out.printf("%.2f", gpa);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.Input();
        s.Output();
    }
}
