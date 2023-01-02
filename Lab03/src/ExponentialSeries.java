import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        double x = 0.1;
        int numTerms = 20;
        System.out.println("Special Series with x = " + x + " and num = " + numTerms + " is: " + specialSeries(x, numTerms));
    }

    public static double calTerm(double x, int numTerms) {
        double product = 1;
        for (int i = 1; i <= numTerms; i += 2) {
            if (i != numTerms) {
                product *= (double) i / (i + 1);
                continue;
            }
            product *= (Math.pow(x, numTerms)) / numTerms;
        }
        return product;
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        for (int i = 3; i <= numTerms; i += 2) {
            sum += calTerm(x, i);
        }
        return sum;
    }
}
