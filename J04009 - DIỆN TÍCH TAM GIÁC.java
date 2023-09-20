import java.text.DecimalFormat;
import java.util.Scanner;

class Point {
    public double x, y;
    public Point(){}
    public Point(double d1, double d2) {
        this.x = d1;
        this.y = d2;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    void nhap(Scanner sc){
        x = sc.nextDouble();
        y = sc.nextDouble();
    }

    public double getD1() {
        return x;
    }
    public double getD2() {
        return y;
    }
    double distance(Point other){
        return Math.sqrt((x-other.x) * (x-other.x) + (y-other.y) * (y-other.y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.nhap(sc);
            B.nhap(sc);
            C.nhap(sc);
            double a = A.distance(B);
            double b = B.distance(C);
            double c = C.distance(A);

            DecimalFormat decf = new DecimalFormat("#0.00");
            if (a + b > c && a + c > b && b + c > a) {
                double res = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c))/(double)4;
                System.out.println(decf.format(res));
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
