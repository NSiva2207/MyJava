package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleArrayListModel {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j=0;j<2;j++){
                list1.add(sc.nextInt());
            }
            list.add(list1);
        }
        System.out.println(list);
    }
}
