import java.util.*;
public class Bin2Dec {
    static boolean isBin(String inStr) {
        for(int i = 0; i < inStr.length(); i++) {
            if(inStr.charAt(i) == '0' || inStr.charAt(i) == '1') {
                continue; //if return here will return 01234 true
            } else {
                return false;
            }
        }
        return true;
    }
    static int convertBinToDec(String inBinStr) {
//        (1011)₂ = (1 × 2³) + (0 × 2²) + (1 × 2¹) + (1 × 2⁰) = (11)₁₀
        int decNum = 0;
        for(int i = 0; i < inBinStr.length(); i++) {
            if(inBinStr.charAt(i) == '0') {
                continue;
            }
            //pos đặc trưng cho số mũ
            int pos = (inBinStr.length() - 1 - i);
            decNum += Math.pow( 2, pos );
        }
        return decNum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inStr = scan.next();
        if(isBin(inStr)) {
            System.out.println("The equivalent decimal number for binary \"" + inStr + "\" is: " + convertBinToDec(inStr));
        } else {
            System.out.println("Error: Invalid Binary String \"" + inStr + "\"");
        }

    }
}
