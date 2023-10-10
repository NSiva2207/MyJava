package Models;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjectsModel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array object :");
        int n = sc.nextInt();
        Student []student = new Student[n];
        for(int i=0;i< student.length;i++) {
            student[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt());
        }
            System.out.println(Arrays.toString(student));


    }
}
class Student{
    public int rollNo;
    public String name;
    public int age;
    public Student(int roll,String name,int age){
        this.rollNo = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
