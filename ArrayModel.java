import java.util.Arrays;
import java.util.Scanner;

public class ArrayModel {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int length = sc.nextInt();
        int []arr = new int[length];
        System.out.println("Enter th elements in the array");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The resultant array is :");
        System.out.println(Arrays.toString(arr));
    }

}
