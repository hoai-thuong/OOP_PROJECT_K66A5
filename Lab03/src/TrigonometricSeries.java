import java.util.Scanner;
public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
//        Test
        // pi/4
        System.out.println("x = pi/4");
        System.out.println(sin(pi / 4, 8));
        System.out.println(Math.sin(pi / 4));
        System.out.println(cos(pi / 4, 8));
        System.out.println(Math.cos(pi / 4));
        System.out.println();
        // pi/6
        System.out.println("x = pi/6");
        System.out.println(sin(pi / 6, 9));
        System.out.println(Math.sin(pi / 6));
        System.out.println(cos(pi / 6, 9));
        System.out.println(Math.cos(pi / 6));
        System.out.println();
        //0
        System.out.println("x = 0");
        System.out.println(sin(0, 10));
        System.out.println(Math.sin(0));
        System.out.println(cos(0, 10));
        System.out.println(Math.cos(0));
        System.out.println();
        // pi/3
        System.out.println("x = pi/3");
        System.out.println(sin(pi / 3, 3));
        System.out.println(Math.sin(pi / 3));
        System.out.println(cos(pi / 3, 3));
        System.out.println(Math.cos(pi / 3));
        System.out.println();

    }
    public static double calFraction (double numerator, int denominator ) {
        double product = 1;
        for (int i = 1; i <= denominator ; i++) {
            product *= numerator / i;
        }
        return product;
    }
    public static double sin (double x, int numTerms) {
        double result = 0.0;
        for (int i = 0 ; i < numTerms ; i++ ){
            if ( i % 2 == 0) {
                result += calFraction(x, 2 * i + 1) ;
            } else {
                result += (-1) * calFraction(x, 2 * i + 1);
            }
        }
        return result;
    }
    public static double cos (double x, int numTerms) {
        double result = 0.0;
        for (int i = 0 ; i < numTerms ; i++) {
            if (i % 2 ==0) {
                result += calFraction(x, 2 * i );
            } else {
                result += (-1) * calFraction(x, 2*i);
            }
        }
        return result;
    }
}