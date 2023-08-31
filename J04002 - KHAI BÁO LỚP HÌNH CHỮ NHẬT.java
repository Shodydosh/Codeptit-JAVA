import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

class Rectangle {
    private double width, height;
    private String color;
    void input(Scanner sc){
        this.width = sc.nextDouble();
        this.height = sc.nextDouble();
        String tmp = sc.nextLine().trim();
        this.color = tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase();
    }
    Boolean isValid() {
        int w = (int) this.width;
        int h = (int) this.height;
        if (w != width || h != height || w <= 0 || h <= 0) return false;
        return true;
    }

    double getWidth() { return width; }
    void setWidth(double newW) { width = newW; }
    double getHeight(){ return height; }
    void setHeight(double newH){ height = newH; }


    String getColor(){ return color; }
    void setColor(String newColor) { color = newColor; }

    double findArea(){
        return height * width;
    }
    double findPerimeter(){
        return 2 * (height + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle A = new Rectangle();
        A.input(scanner);
        if(A.isValid()){
            System.out.printf("%.0f ", A.findPerimeter());
            System.out.printf("%.0f ", A.findArea());
            System.out.print(A.getColor());
        }
        else {
            System.out.println("INVALID");
        }
    }
}
