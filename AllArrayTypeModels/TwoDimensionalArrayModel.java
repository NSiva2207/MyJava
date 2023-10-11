package AllArrayTypeModels;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayModel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns :");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];

        System.out.println("Enter elements in the array : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
