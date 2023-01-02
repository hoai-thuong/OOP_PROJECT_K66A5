import java.util.*;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Pattern A : ");
        printTriangularPatternA(size);
        System.out.println("Pattern B : ");
        printTriangularPatternB(size);
        System.out.println("Pattern C : ");
        printTriangularPatternC(size);
        System.out.println("Pattern D : ");
        printTriangularPatternD(size);
    }

    static void printTriangularPatternA(int size) {
        String str = "# ";
        //neu row bang 1, thi in ra 1 #, row =  2 thi in 2 2 #
        for (int row = 1; row <= size; row++) {
            System.out.println(str.repeat(row));
        }
    }

    static void printTriangularPatternB(int size) {
        String str = "# ";
        //neu row bang 1, thi in ra 1 #, row =  2 thi in 2 2 #
        for (int row = size; row >= 1; row--) {
            System.out.println(str.repeat(row));
        }
    }

    static void printTriangularPatternC(int size) {
        for ( int row = 1 ; row <= size ; row++) {
            for (int col = 1; col <= size ; col++){
                if ( row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printTriangularPatternD(int size) {
        for ( int row = 1 ; row <= size ; row++) {
            for (int col = 1; col <= size ; col++){
                if ( row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
