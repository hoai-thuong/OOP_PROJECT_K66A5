import java.util.Scanner;
public class Exponent {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = exponent(base, exponent);
        System.out.println(base + " raise to the power of " + exponent + ": " + result);
    }
    public static int exponent (int base, int exponent) {
        //base ** base ** .....
        int product = 1;
        for (int i = 1; i <= exponent; i++) {
            product *= base;
        }
        return product;
    }
}
