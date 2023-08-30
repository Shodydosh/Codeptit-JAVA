import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int res = solve(n, a);
        System.out.println(res);
    }

    public static int solve(int n, int[] a) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            if(!stack.isEmpty() && (a[i] + stack.peek()) % 2 == 0){
                stack.pop();
            } else {
                stack.push(a[i]);
            }
        }
        return stack.size();
    }
}
