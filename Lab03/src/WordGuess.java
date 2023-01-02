import java.util.ArrayList;
import java.util.*;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class WordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String guessString = "testingg";
        String guessString = null;
        try {
            guessString = Files.readAllLines(Paths.get("/Users/hoaithuong/Library/Mobile Documents/com~apple~TextEdit/Documents/args.txt")).get((int) (Math.random() * 10)); //input random line from a file ( < 10 lines )
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String undercore = "_";
        String startString = undercore.repeat(guessString.length());
        ArrayList<String> s1 = convertStringToArray(guessString);
        ArrayList<String> s2 = convertStringToArray(startString);
//        int count1 = 0;
        do {
            int count1 = 0;  //đếm khi nào bằng s1.length tức là ko điền thêm nữa
            int countTrials = 0;
            List l = new ArrayList();
            while (true) {
                System.out.print("Enter the guess: ");
                String word = sc.nextLine();
                l.add(word);
                int count2 = 0;
                for (int m = 0; m < l.size(); m++) {
                    if (l.get(m).equals(word)) {
                        count2++;
                    }
                }
                if (count2 == 1) {
                    for (int i = 0; i < s1.size(); i++) {
                        if (s1.get(i).equals(word)) {
                            s2.set(i, s1.get(i));
                            count1++;
                        }
                    }
                }
                countTrials++;
                if (word.equals(guessString)) {
                    System.out.println("Congratulation");
                    System.out.println("You got it in " + countTrials);
                    break;
                } else {
                    System.out.println("Trial: " + countTrials);
                    System.out.println(s2.toString());
                    if (count1 == s1.size()) {
                        System.out.println("Congratulation");
                        System.out.println("You got it in " + countTrials);
                        break;
                    }

                }
            }
            break;

        } while (true);
    }

    public static ArrayList<String> convertStringToArray(String str) {
        ArrayList<String> store = new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            String substring = String.valueOf(str.charAt(i));
            store.add(substring);
        }
        return store;
    }
}
