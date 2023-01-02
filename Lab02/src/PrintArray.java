import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int NUM_ITEMS;
        int[] items;
        do {
            System.out.print("Enter the number of items: ");
            NUM_ITEMS = sc.nextInt();
        } while (NUM_ITEMS <= 0);
        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space):  ");
            for (int i = 0; i < items.length; i++){
                items[i] = sc.nextInt();
            }
            System.out.print("The value are: ");
            for (int i = 0; i < items.length; i++){
                if (i == 0 && items.length > 1 ){
                    System.out.print("[" + items[i] +", ");
                } else if (items.length == 1){
                    System.out.print("[" + items[i] + "]");
                } else {
                    if (i == items.length - 1){
                        System.out.print(items[i] + "]");
                    } else {
                        System.out.print(items[i] + ", ");
                    }
                }
            }
        sc.close();
    }
}



//
//import java.util.Scanner;
//public class OnePointOne {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the number of items: ");
//        int arrSize = scan.nextInt();
//        int[] arr = new int[arrSize];
//        System.out.print("Enter the value of all items (separated by space): ");
//        for(int i = 0; i < arrSize; i++) {
//            arr[i] = scan.nextInt();
//        }
//        System.out.print("The values are: ");
//        System.out.print("[");   cứ in ra [ trước
//        for(int i = 0; i < arrSize; i++) {
//            System.out.print((i==0) ? arr[i] : ", " + arr[i]);  //neu la phan tu 1 thi in  phan tu  neu ko thi in ra , + hí ỷij 
//        }
//        System.out.print("]");
//    }
//}
