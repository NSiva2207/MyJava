package String;

import java.util.Scanner;

public class StringModel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("str1 :");
        String str1 = sc.nextLine(); //it takes group of words or sentence
        System.out.println(str1);
        System.out.println("str :");
        String str = sc.next(); //it takes only one word
        System.out.println(str);

        for(int i=0;i<str.length();i++) {
            System.out.println(str.charAt(i));
        }
        //StringBuilder
        StringBuilder str2 = new StringBuilder();
        for(int i=0;i<str.length();i++){
            str2.append(str.charAt(i));
        }
        System.out.println(str2);


    }
}
