import java.io.*;
import java.text.*;
import java.util.*;

class NV {
    public static Integer stt = 1;
    private String id, name, pos;
    private Integer s, days, phuCap, bonus, salary;

    public NV(String a, Integer b, Integer c, String d){
        this.name = a;
        this.s = b;
        this.days = c;
        this.id = "NV" + String.format("%02d", this.stt);

        int tmp = b * c;
        if(c >= 25) this.bonus = tmp / 5;
        else if(c > 22) this.bonus = tmp / 10;
        else this.bonus = 0;

        this.phuCap = 150000;
        if(d.equals("GD")) this.phuCap = 250000;
        if(d.equals("PGD")) this.phuCap = 200000;
        if(d.equals("TP")) this.phuCap = 180000;
        this.salary = tmp + this.phuCap + this.bonus;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + s*days + " " + bonus + " " + phuCap + " " + salary;
    }

}

public class Main {
    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new File("VANBAN.in")).useLocale(Locale.getDefault());
        String a = sc.nextLine();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        sc.nextLine();
        NV x = new NV(a, b, c, sc.nextLine());
        System.out.print(x);
    }
}
