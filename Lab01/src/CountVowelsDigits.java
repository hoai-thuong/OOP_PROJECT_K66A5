//import java.util.*;
//public class CountVowelsDigits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine().toLowerCase();
////        System.out.println(str);
//        int count1 = 0;
//        int count2 = 0;
//        for (int index = 0; index < str.length(); index++) {
//            char c = str.charAt(index);
//            if (Character.isDigit(c)) {
//                count1++;
//            }
//            if (c == 'a' || c == 'u' || c == 'e' || c == 'o' || c == 'i') {
//                count2++;
//            }
//        }
//        double percentDigits = (double) (count1 / str.length()) * 100;
//        double percentVowels = (double) (count2 / str.length()) * 100;
//        System.out.println("Number of vowels: " + count2 + " ( " + percentVowels + " % ) ");
//        System.out.println("Number of digits: " + count1 + " ( " + percentDigits + " % ) ");
//    }
//}

import java.util.*;
public class CountVowelsDigits{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = scan.next();
        int totalVowels = 0;
        int totalDigits = 0;
        for ( int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            //convert inStr.charAt(charIdx) to string to use regex
            if(Character.toString(inStr.charAt(charIdx)).matches("^[a,e,i,o,u,A,E,I,O,U]$")){
                totalVowels += 1;
            }
            //check is a digit or not
            if(Character.isDigit(inStr.charAt(charIdx))) {
                totalDigits += 1;
            }
        }
        double vowelsPercent = (double)totalVowels / inStr.length() * 100;
        double digitsPercent = (double)totalDigits / inStr.length() * 100;
        System.out.println("Number of vowels: " + totalVowels + " ( " + vowelsPercent + " ) ");
        System.out.println("Number of digits: " + totalDigits + " ( " + digitsPercent + " ) ");
    }
}

