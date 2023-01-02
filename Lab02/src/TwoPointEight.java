
import java.util.*;
public class TwoPointEight {
    static int[] inputArr(Scanner scan){
        System.out.print("Enter the array size: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static int[] copyOf(int[] array) {  //truong hop neu bang nhau ve do dai, va buoc cai copyarr tao ra phi bang do dai arr nhap vao
        int[] copyArr = new int[array.length];
        for(int i = 0 ; i < array.length; i++) {
            copyArr[i] = array[i];
        }
        return copyArr;
    }
    public static int[] copyOf(int[] array, int newLength) {  //day  la truong hop neu do dai ko bang nhau thi phai nhap cai new length  vso
        int[] copyArr = new int[newLength];
        if (copyArr.length > array.length) {
            for(int i = 0; i < copyArr.length; i++) {
                if(i < array.length) {
                    copyArr[i] = array[i];
                } else {
                    copyArr[i] = 0;
                }
            }
        }
        if (copyArr.length < array.length) {
            for(int i = 0 ; i < copyArr.length; i++) {
                copyArr[i] = array[i];
            }
        }
        return copyArr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input original array");
        int[] arr1 = inputArr(scan);  //nhap ca do dai ca phan tu
        System.out.println("Input the length of new array: ");
        int newArrLength = scan.nextInt();
        if(newArrLength == arr1.length ) {
            System.out.println(Arrays.toString(copyOf(arr1)));
        } else {
            System.out.println(Arrays.toString(copyOf(arr1,newArrLength)));
        }
    }
}
