import java.util.*;
public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Pattern A : ");
        printBoxPatternA(size);
        System.out.println("Pattern B : ");
        printBoxPatternB(size);
        System.out.println("Pattern C : ");
        printBoxPatternC(size);
        System.out.println("Pattern D : ");
        printBoxPatternD(size);
    }
    static void printBoxPatternA(int size) {
        for (int row = 1; row < size ; row++) {
            for ( int col = 1 ; col < size ; col++) {
                if ( row == 1 || row == size - 1 || col == 1 || col == size -1 ) {
                    System.out.print("# ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printBoxPatternB (int size) {
        for (int row = 1; row < size ; row++) {
            for ( int col = 1 ; col < size ; col++) {
                if ( row == 1 || row == size - 1 || col == row ) {
                    System.out.print("# ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printBoxPatternC (int size) {
        for ( int row = 1 ; row < size ; row++) {
            for (int col = 1; col < size ; col++){
                if (row + col == size || row == 1 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printBoxPatternD (int size) {
        for ( int row = 1 ; row < size ; row++) {
            for (int col = 1; col < size ; col++){
                if (row + col == size  || row == 1 || row == size - 1 || col == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
