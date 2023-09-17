import java.io.*;
import java.util.*;


public class Main {
    static class GV {
        String PhuCap, name;
        Long salary;
        Scanner sc = new Scanner(System.in);
        void Input(){
            PhuCap = sc.nextLine();
            name = sc.nextLine();
            salary = sc.nextLong();
        }

        void Output(){
            int phucap = 0;
            String tmp1 = PhuCap.substring(0,2);
            if(tmp1.equals("HP")) phucap = 900000;
            else if(tmp1.equals("GV")) phucap = 500000;
            else phucap = 2000000;

            String tmp = PhuCap.substring(2,4);
            Long heso = Long.parseLong(tmp);

            System.out.print(PhuCap + " " + name + " ");
            System.out.print(heso + " " + phucap + " ");
            System.out.println(heso * salary + phucap);
        }
    }
    public static void main(String[] args) throws IOException {
        GV a = new GV();
        a.Input();
        a.Output();
    }
}
