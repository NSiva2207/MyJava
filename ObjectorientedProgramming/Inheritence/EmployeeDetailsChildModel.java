package ObjectorientedProgramming.Inheritence;

public class EmployeeDetailsChildModel extends EmployeeDetailsParentsModel {
    private int Salary;
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
    public int GetSalary(){
        return Salary;
    }
    public EmployeeDetailsChildModel(){
        super();
        this.Salary = -1;
    }
    public EmployeeDetailsChildModel(String Emp_id,String Emp_Name,int Salary){
        super(Emp_id,Emp_Name);
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetailsChildModel{" +
                "EmployeeID= "+getEmp_id()+" "+
                "EmployeeName="+getEmp_Name()+" "+
                "Salary=" + Salary +" "+
                '}';
    }
}
