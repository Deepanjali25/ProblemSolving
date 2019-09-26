package Hackerrank.ProblemSolving;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RansomNote {
    public static boolean checkMagazine(String[] magazine, String[] note){
        Map<String, Integer> magazineOccurences = new HashMap<String, Integer>();
        Map<String, Integer> ransomOccurences = new HashMap<String, Integer>();
        for(String word: magazine) {
            if (!magazineOccurences.containsKey(word)) magazineOccurences.put(word, 0);
            magazineOccurences.put(word, magazineOccurences.get(word) + 1);
        }
        for(String word: note) {
            if (!ransomOccurences.containsKey(word)) ransomOccurences.put(word, 0);
            ransomOccurences.put(word, ransomOccurences.get(word) + 1);
        }
        for(String key: ransomOccurences.keySet()){
            if (!magazineOccurences.containsKey(key))
                return false;
            int needed = ransomOccurences.get(key);
            if (magazineOccurences.get(key) < needed)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = scanner.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = scanner.next();
        }
        System.out.println(checkMagazine(magazine, ransom) ? "Yes" : "No");
    }
}