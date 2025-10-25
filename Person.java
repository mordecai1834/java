
public abstract class Person{
protected String fristName; 
protected String lastName; 
protected int ID; 

public Person(String firstName, String lastName, int ID){
    setfirstName(firstName);
    setLastName(lastName);
    setID(ID); 
}

public String getfirstName(){

    return fristName; 

}
public String getlastName(){

    return lastName; 
}

public int getID(){

    return ID; 
}

public void setfirstName(String fristName){
if(fristName == null || fristName.isEmpty()){
throw new IllegalArgumentException("First name cannot be empty"); 
}
this.fristName = fristName; 
}

public void setLastName(String lastName){
if(lastName == null || lastName.isEmpty()){
throw new IllegalArgumentException("First name cannot be empty"); 
}
this.lastName = lastName; 
}

public void setID(int ID){
if(ID == 0){
throw new IllegalArgumentException("ID cannot be 0"); 
}
this.ID = ID; 
}

@Override
public String toString() {
    return String.format("%s, %s (%d)", getlastName(), getfirstName(), getID());
}

}