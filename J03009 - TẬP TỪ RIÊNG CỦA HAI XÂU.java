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
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            Set<String> set1 = tokenizeAndRemoveDup(s1);
            Set<String> set2 = tokenizeAndRemoveDup(s2);
            set1.removeAll(set2);
            TreeSet<String> res = new TreeSet<>(set1);
            for(String word : res){
                System.out.print(word + ' ');
            }
            System.out.println();
        }
        scanner.close();
    }

    private static Set<String> tokenizeAndRemoveDup(String input) {
        Set<String> words = new HashSet<>();
        StringTokenizer tokenizer = new StringTokenizer(input);
        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            words.add(word);
        }
        return words;
    }
}
