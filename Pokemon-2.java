
class Pokemon{
private String Name; 
private String type1; 
private String type2; 
private int HP; 
private int Attack; 
private int Defense; 
private int Special; 
private int Speed; 

public Pokemon(String name, String type1, String type2, int HP, int Attack, int Defense, int Special, int Speed){
this.Name = name; 
this.type1 = type1; 
this.type2 = type2; 
this.HP = HP; 
this.Attack = Attack; 
this.Defense = Defense; 
this.Special = Special; 
this.Speed = Speed; 
}
public void setName(String name){

name = name; 
}
public void settype1(String type1){

type1 = type1; 
}

public void settype2(String type2){

type2 = type2; 
}

public void setHP(int HP){

HP = HP; 
}
public void setAttack(int Attack){

Attack = Attack; 
}

public void setDefense(int Defense){

Defense = Defense; 
}

public void setSpecial(int Special){

Special = Special; 
}
public void setSpeed(int Speed){

Speed = Speed; 
}

public String getName(){
return Name; 
}

public String gettype1(){
return type1; 
}

public String gettype2(){
return type2; 
}
public int getHP(){
return HP; 
}
public int getAttack(){
return Attack; 
}
public int getDefense(){
return Defense; 
}
public int getSpecial(){
return Special; 
}
public int getSpeed(){
return Speed; 
}
@Override
public String toString() {
    return String.format(
        "%-12s %-10s %-10s HP:%3d Atk:%3d Def:%3d Spc:%3d Spd:%3d",
        Name, type1, type2, HP, Attack, Defense, Special, Speed
    );
}

}