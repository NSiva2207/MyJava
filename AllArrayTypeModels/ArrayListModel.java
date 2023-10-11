package AllArrayTypeModels;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListModel {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter elements in the list : ");
        for(int i=0;i<3;i++){
            list.add(sc.next());
        }
        System.out.println(list);
    }
}
