package Models;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModel {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int length = sc.nextInt();
        int []arr = new int[length];
        String[] str = new String[length];
        //arr = integerArray(arr,length);
        /*System.out.println(Arrays.toString(arr));*/
        str = stringArrray(str,length);
        System.out.println(Arrays.toString(str));

    }
    public static int[] integerArray(int []arr, int length){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th elements in the array");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static String[] stringArrray(String[] arr,int length){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th elements in the array");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.next();
        }
        return arr;
    }

}
