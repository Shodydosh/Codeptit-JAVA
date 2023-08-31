import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

class Point {
    double x, y;

    void input(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }

    double distanceTo(Point p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0*x0 + y0*y0);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            Point A = new Point();
            Point B = new Point();
            A.input(scanner);
            B.input(scanner);
            System.out.printf("%.4f\n", A.distanceTo(B));
        }
    }
}
