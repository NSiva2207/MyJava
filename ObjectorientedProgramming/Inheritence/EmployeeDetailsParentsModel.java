package ObjectorientedProgramming.Inheritence;

public class EmployeeDetailsParentsModel {
    private String Emp_id;
    private String Emp_Name;

    //Getters and setters
    public String getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(String emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    //constructor
    public EmployeeDetailsParentsModel(){
        Emp_id = null;
        Emp_Name = null;
    }

    public EmployeeDetailsParentsModel(String emp_id, String emp_Name) {
        Emp_id = emp_id;
        Emp_Name = emp_Name;
    }

    //to string

    @Override
    public String toString() {
        return "EmployeeDetailsParentsModel{" +
                "Emp_id='" + Emp_id + '\'' +
                ", Emp_Name='" + Emp_Name + '\'' +
                '}';
    }
}
