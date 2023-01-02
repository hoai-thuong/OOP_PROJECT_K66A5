////import jdk.jshell.Snippet;
//
//import com.sun.source.tree.WhileLoopTree;
//
////import java.util.Scanner;

import java.util.Scanner;
//
//public class hasEight {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int SENITEL = -1;
//        int number;
////        System.out.print("Enter a postive integer (or -1 to end ): ");
////        number = sc.nextInt();
////        while ( number != SENITEL) {
//        do {
//            try {
//                while (true) {
//                    System.out.print("Enter a postive integer (or -1 to end ): ");
//                    number = sc.nextInt();
//                    while (number != SENITEL) {
//                        if (number < 0 && number != -1) {
//                            System.out.print("Positive integer only \n");
//                        }
//                        break;
//
//                    }
////                    if (number < 0 && number != -1) {
////                        System.out.print("Positive integer only \n");
////                    }
//                    break;
//                }
//            } catch (java.util.InputMismatchException e) {
//                sc.nextInt();
//                System.out.print("Integer only");
//            }
//        }
//        while (true);
//    }
//}

class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a postive integer (or -1 to end ): ");
        number = sc.nextInt();
        int sum = 0;
        while (number != -1) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter a postive integer (or -1 to end ): ");
            number = sc.nextInt();
        }
        System.out.print("The magic sum is :" + sum);
    }
    public static boolean hasEight(int n) {
        int rem;
        while (n > 0) {
            rem = n % 10;
            if (rem == 8) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

}