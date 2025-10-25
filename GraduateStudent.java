public class GraduateStudent extends Student implements Employee {
    private double salary;

    public GraduateStudent(String firstName, String lastName, int id, String major, String minor, double gpa, double salary) {
        super(firstName, lastName, id, major, minor, gpa);
        setSalary(salary);
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
    public String toString(){
    return String.format("%s, %s (%d) [Studying %s] GPA: %.2f ($%.2f)\n",getlastName(), getfirstName(), getID(),getMajor(), getGPA(), getSalary());
    }

}



