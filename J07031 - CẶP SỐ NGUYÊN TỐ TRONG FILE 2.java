import java.util.*;
import java.io.*;

public class Main {
    public static int[] b = new int[1000001];
    public static void sieve(){
        Arrays.fill(b, 1);
        b[0] = b[1] = 0;
        for(int i=2; i*i < 1000000; ++i){
            if(b[i] == 1){
                for(int j = i*i; j < 1000000; j+= i) b[j] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ot1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ot2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> a1 = (ArrayList<Integer>) ot1.readObject();
        List<Integer> a2 = (ArrayList<Integer>) ot2.readObject();
        ot1.close();
        ot2.close();

        TreeSet<Integer> tree1 = new TreeSet<>();
        for(Integer x : a1)
            if(b[x] == 1) tree1.add(x);

        TreeSet<Integer> tree2 = new TreeSet<>();
        for(Integer x : a2)
            if(b[x] == 1) tree2.add(x);

        for(Integer x : tree1){
            if(x < 1000000 - x){
                if(!tree2.contains(x) && !tree2.contains(1000000-x) && tree1.contains(1000000-x))
                    System.out.println(x + " " + (1000000-x));
            }
            else break;
        }
    }
}
