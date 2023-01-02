import java.util.Scanner;
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a hex string: ");
        String inStr =  sc.nextLine();
        if (isHex(inStr)) {
            System.out.print(inStr + " is a hex String");
        } else {
            System.out.println(inStr + " is not a hex String");
        }
    }
    static boolean isHex (String inStr)  {
        for (int i = 0 ; i < inStr.length(); i++) {
            if ( inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9' || inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f' || inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'F') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
