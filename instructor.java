public class instructor extends Person implements Employee{
protected String department; 
private double salary;
public instructor(String firstName, String lastName, int ID, String department, double salary) {
    super(firstName, lastName, ID);
    setDeparment(department);
    setSalary(salary);
}

public String getDepartment(){
    return department; 
}
public void setDeparment(String department){
if(department == null || department.isEmpty()){
throw new IllegalArgumentException("department name cannot be empty"); 
}
this.department = department; 
}
@Override
    public double getSalary() {
        return salary;
    }

@Override
public void setSalary(double salary) {
if (salary < 0) {
throw new IllegalArgumentException("Salary cannot be negative.");
}
this.salary = salary;
}

@Override
public String toString() {
    return String.format("Prof. %s (%d) [Dept. of %s] ($%.2f)",getlastName(), getID(), getDepartment(), getSalary());
}


}