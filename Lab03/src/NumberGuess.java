import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
//        System.out.println((int) (Math.random() * 100));  random integer between 0 and 100
        int key = (int) (Math.random() * 100);
//        System.out.println(key);
        Scanner sc = new Scanner(System.in);
        System.out.println("Key in your guess: ");
        int countTrials = 0;
        while (true) {
            int guessNumber = sc.nextInt();
            if (guessNumber > key) {
                System.out.println("Try lower");
            } else if (guessNumber < key){
                System.out.println("Try higher");
            } else {
                System.out.println("you got it in " + countTrials);
            }
            countTrials++;
        }
//        System.out.println("you got it in" + count);



    }
}
