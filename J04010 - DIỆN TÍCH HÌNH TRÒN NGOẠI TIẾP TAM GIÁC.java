import java.math.BigInteger;
import java.util.Scanner;

class Point {
    public double x, y;
    void Input(Scanner sc){
        x = sc.nextDouble();
        y = sc.nextDouble();
    }
    public Point(){}
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    double distance(Point other){
        return Math.sqrt((x-other.x) * (x-other.x) + (y-other.y) * (y-other.y));
    }
}

public class Main {
    public static boolean check(double a, double b, double c){
        return !(a >= b + c) && !(b >= c + a) && !(c >= a + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.Input(sc);
            B.Input(sc);
            C.Input(sc);
            double a = A.distance(B);
            double b = B.distance(C);
            double c = C.distance(A);

            if(check(a, b, c)){
                double s = 0.5 * (a + b + c);
                double triangle_area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                double r = (a * b * c) / (4 * triangle_area);
                double circle_area = Math.PI * Math.pow(r, 2);
                System.out.printf("%.3f\n", circle_area);
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
