import java.io.*;
import java.util.*;


public class Main {
    static class Student {
        Scanner sc = new Scanner(System.in);
        String name, gender, address, dob, number, day;
        void Input() {
            name = sc.nextLine();
            gender = sc.nextLine();
            dob = sc.nextLine();
            address = sc.nextLine();
            number = sc.nextLine();
            day = sc.nextLine();
        }

        void Output() {
            System.out.print("00001 ");
            System.out.print(name + ' ' + gender + ' ' + fix(dob) + ' ' + address + ' ');
            System.out.println(number + ' ' + fix(day));
        }
    }
    public static String fix(String dob) {
        StringBuilder ss = new StringBuilder(dob);
        if(ss.charAt(1) == '/'){
            ss.insert(0, '0');
        }
        if(ss.charAt(4) == '/'){
            ss.insert(3, '0');
        }
        return ss.toString();
    }
    public static void main(String[] args) throws IOException {
        Student s = new Student();
        s.Input();
        s.Output();
    }
}
