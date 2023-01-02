//import java.util.Scanner;
//public class PrintArrayInStars {
//    public static void main(String[] args) {
//        int num_items;
//        Scanner sc =  new Scanner(System.in);
//        do {
//            System.out.print("Enter the number of items: ");
//            num_items = sc.nextInt();
//            if (num_items < 0 ) {
//                System.out.println("Please enter non-negative number ");
//            }
//        } while (num_items < 0 );
////        System.out.println("fd");
//        int [] items  = new int[num_items];
//        for (int i = 0 ; i < items.length; i ++) {
//            do {
//                System.out.print("Enter the values of all items (seperate by space ): ");
//                items[i] = sc.nextInt();
//                if (items[i] < 0 ) {
//                    System.out.println("Please enter non-negative integer");
//                    continue;
//                }
//                break;
//            } while (items[i] < 0);
//        }
//        printInStar(items);
//    }
//    public static void printInStar(int [] arr) {
//
//    }
//
//}
//package ArrayVSMethodEx;
import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemsSize = scan.nextInt();

        int[] items = new int[itemsSize];
        System.out.print("Enter the value of all items (separated by space): ");

        //input
        for (int idx = 0; idx < items.length; idx++) {
//            items[idx] = scan.nextInt();
            int item = scan.nextInt();
            if(item > 0) {
                items[idx] = item;
            } else {
                System.out.println("chi nhan so duong: ");
            }
        }
        //output
        for(int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for(int row = 0; row <= items[idx]; row++) {
                if(row < items[idx]) {
                    System.out.print("*");
                } else {
                    System.out.print( "(" + row + ")");
                }
            }
            System.out.println();
        }

    }
}

