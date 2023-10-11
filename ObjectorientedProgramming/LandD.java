package ObjectorientedProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LandD {
    public static void main(String ...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int n=sc.nextInt();
        EmployeeDetails[] emp = new EmployeeDetails[n];
        for(int i=0;i<n;i++){
            emp[i] = new EmployeeDetails(sc.next(),sc.next());
        }
        System.out.println(Arrays.toString(emp));
    }
}
class EmployeeDetails{
    String emp_Id;
    String emp_Name;
    public EmployeeDetails(){
        this ("320","mohan");
    }

    public EmployeeDetails(String emp_Id, String emp_Name) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "emp_Id='" + emp_Id + '\'' +
                ", emp_Name='" + emp_Name + '\'' +
                '}';
    }
}
