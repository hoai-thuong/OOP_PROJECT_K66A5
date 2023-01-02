import java.util.Scanner;
public class Oct2Dec {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        int result = 0;
        int tempInt;
//        int inStrLen,result = 0,tempInt;
        char temp;
//        boolean user = true;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter an octal string: ");
        inStr = in.next();
        inStrLen = inStr.length();
        for(int power = 0; power < inStrLen; power++){
            temp = inStr.charAt(inStrLen - 1 - power);
//            System.out.println(temp);
            //chuyen sang kieu int de lam viec voi phep tinh
            tempInt = temp - '0';
//            System.out.println(tempInt);
            result += tempInt * Math.pow(8,power);
            //147 = (1 × 8²) + (4 × 8¹) + (7 × 8⁰) = 103
            //cho chay power to get the mux
            //tim moi lien he cua mu voi chi so
        }
        System.out.println("The decimal equivalent is: "+ result);
    }
}
