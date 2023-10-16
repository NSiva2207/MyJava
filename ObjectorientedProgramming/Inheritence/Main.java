package ObjectorientedProgramming.Inheritence;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of employees");
        int n = sc.nextInt();
        EmployeeDetailsChildModel[] child = new EmployeeDetailsChildModel[n];
        System.out.println("Enter the details: ");
        for(int i=0;i<n;i++){
            child[i] = new EmployeeDetailsChildModel(sc.next(), sc.next(), sc.nextInt());
        }

        System.out.println(Arrays.toString(child));
    }
}
