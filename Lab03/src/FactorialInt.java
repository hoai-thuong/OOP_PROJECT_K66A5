public class FactorialInt {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            int result = calFactorial(i);
            System.out.println("The factorial of " + i + " is " + result);
            if (Integer.MAX_VALUE / calFactorial(i) < (i + 1)) {
                i++;
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
            i++;
        }
    }

    public static int calFactorial(int n) {
        if (n > 0) {
            return n * calFactorial(n - 1);
        } else {
            return 1;
        }
    }
}
