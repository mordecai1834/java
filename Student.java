public class Student extends Person{
protected String major; 
protected String minor; 
protected double GPA; 
    
public Student(String firstName, String lastName, int ID, String major, String minor, double GPA){
super(firstName, lastName, ID);

setMajor(major);
setMinor(minor);
setGPA(GPA);

}
public String getMajor(){
return major; 
}
public String getMinor(){
return minor; 
}
public double getGPA(){
return GPA; 
}
public void setMajor(String major){

if(major == null || major.isEmpty()){
throw new IllegalArgumentException("First name cannot be empty"); 
}
this.major = major; 
}
public void setMinor(String minor){

if(minor == null || minor.isEmpty()){
throw new IllegalArgumentException("First name cannot be empty"); 
}
this.minor = minor; 
}
public void setGPA(double GPA){

if(GPA < 0 || GPA > 4.0){
throw new IllegalArgumentException("First name cannot be empty"); 

}
this.GPA = GPA; 
}

@Override
public String toString() {
    return String.format("%s, %s (%d) [%s Major / %s Minor] GPA: %.2f",getlastName(), getfirstName(), getID(), getMajor(), getMinor(), getGPA());
}


}