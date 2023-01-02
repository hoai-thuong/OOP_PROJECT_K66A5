import java.util.Scanner;
public class TwoPointSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int arrSize1 = sc.nextInt();
        System.out.print("Enter the value of first array: ");
        int [] arr1 =  new int[arrSize1];
        for ( int i = 0 ; i < arr1.length ; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int arrSize2 = sc.nextInt();
        System.out.print("Enter the value of second array: ");
        int [] arr2 =  new int[arrSize2];
        for ( int i = 0 ; i < arr2.length ; i++) {
            arr2[i] = sc.nextInt();
        }
        if (equals(arr1, arr2)) {
            System.out.println("Two arrays is exactly the same");
        } else {
            System.out.println("Two arrays is not the same");
        }
    }
    public static boolean equals (int [] arr1, int[] arr2)  {
        if ( arr1.length == arr2.length) {
            for (int i = 0 ; i < arr1.length; i++) {
                for (int j = 0 ; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
