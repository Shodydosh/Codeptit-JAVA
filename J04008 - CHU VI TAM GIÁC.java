import java.util.Scanner;

public class Main {
    static class Point {
        Double x, y;

        void Input(Scanner sc) {
            x = sc.nextDouble();
            y = sc.nextDouble();
        }

        double distance(Point other) {
            double x0 = this.x - other.x;
            double y0 = this.y - other.y;
            return Math.sqrt(x0 * x0 + y0 * y0);
        }
    }

    static class Triangle {
        Point a, b, c;

        public Triangle(Point A, Point B, Point C) {
            a = A;
            b = B;
            c = C;
        }

        double check() {
            Double A = a.distance(b);
            Double B = c.distance(b);
            Double C = a.distance(c);
            if (A + B > C && B + C > A && A + C > B)
                return A + B + C;
            return -1;
        }

        @Override
        public String toString() {
            return "123";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.Input(sc);
            B.Input(sc);
            C.Input(sc);
            Triangle x = new Triangle(A, B, C);
            double ans = x.check();
            if (ans == -1) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f\n", ans);
            }
        }
    }
}
