import java.util.Scanner;

public class TwoPointFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int arrSize = sc.nextInt();
        int arr[] = new int[arrSize];
        System.out.print("Enter the value: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the check value: ");
        int key = sc.nextInt();
        if (contain(arr,key))  {
            System.out.print("Array contains " + key);
        } else {
            System.out.print("Array doesn't contain " + key);
        }
    }
    public static boolean contain(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}