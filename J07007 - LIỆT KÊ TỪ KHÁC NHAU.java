import java.io.*;
import java.util.*;

class WordSet {
    Set<String> set;
    public WordSet(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        set = new TreeSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String ans = "";
        for(String i : set)
            ans += i + "\n";
        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
