import java.util.Scanner;
public class TwoPointSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int arrSize = sc.nextInt();
        System.out.print("Enter the value: ");
        int arr [] =  new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key value: ");
        int key = sc.nextInt();
        int idx = search(arr, key);
        if (idx != 1) {
            System.out.println("Array contains key value at index " + idx) ;
        } else
            System.out.println("Array doesnot contain key value ");
    }
    public static int search (int [] arr, int key) {
        for ( int i = 0 ; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
