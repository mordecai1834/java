import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections; 
public class Assignment5{

public static void main(String[] args) {
List<Integer> numbers = new ArrayList<>(); 
numbers.add(12);
numbers.add(12);
numbers.add(4);
numbers.add(5);
numbers.add(19);
numbers.add(19);
numbers.add(5);
numbers.add(0);
numbers.add(17);
numbers.add(17);
numbers.add(12);
numbers.add(14);
numbers.add(19);
numbers.add(2);
numbers.add(8);
numbers.add(10);
numbers.add(2);
numbers.add(10);
numbers.add(2);
numbers.add(7);
numbers.add(11);
numbers.add(14);
numbers.add(1);
numbers.add(4);
numbers.add(15);
numbers.add(16);
numbers.add(7);
numbers.add(10);
numbers.add(14);
numbers.add(5);
numbers.add(5);
numbers.add(4);
numbers.add(2);
numbers.add(11);
numbers.add(4);
numbers.add(14);
numbers.add(16);
numbers.add(7);
numbers.add(4);
numbers.add(19);
numbers.add(11);
numbers.add(5);
numbers.add(8);
numbers.add(6);
numbers.add(19);
numbers.add(14);
numbers.add(7);
numbers.add(6);
numbers.add(4);
numbers.add(16);

                
    
System.out.println("Task 1: iterate through list"); 
task1(numbers); 
System.out.print("\n"); 

System.out.println("Task 2: find the unquie numbers"); 
task2(numbers); 
System.out.print("\n"); 

System.out.println("Task 3: what numbers repeat in the list"); 
task3(numbers); 
System.out.print("\n"); 

System.out.println("Task 4: remove all odd elements from the array"); 
task4(numbers); 
System.out.print("\n"); 

System.out.println("Task 5: remove all double digit numbers"); 
task5(numbers); 
System.out.print("\n"); 


}
    

private static void task1(List<Integer> numbers){
Iterator<Integer> num1 = numbers.iterator(); 
while(num1.hasNext()){

System.out.print(", " + num1.next()); 
}

}

private static void task2(List<Integer> numbers){
Set<Integer> unqiueNumbers = new HashSet<>();
for(Integer num: numbers){
unqiueNumbers.add(num);
}

List<Integer> sorted = new ArrayList<>(unqiueNumbers); 
Collections.sort(sorted); 
System.out.print(sorted); 

}

private static void task3(List<Integer> numbers){
Map<Integer, Integer> repeatingNum = new HashMap<>(); 
for(Integer num: numbers){
    if(repeatingNum.containsKey(num)){
        repeatingNum.put(num, repeatingNum.get(num) + 1); 
         
    }
    else{
        repeatingNum.put(num,1); 
    }
   
}
Set<Integer> keySet = repeatingNum.keySet(); 
ArrayList<Integer> orderedArray = new ArrayList<>(keySet);
for (Integer key : orderedArray) {
        int count = repeatingNum.get(key);
    System.out.println(key + " appears " + count + (count ==1? " time ": " times ") );
}
}

private static void task4(List<Integer> numbers){
int index = 0;
Iterator<Integer> iterator = numbers.iterator(); 

while(iterator.hasNext()){
iterator.next(); 
if(index % 2 == 1){
iterator.remove(); 
}
index++; 
}
System.out.print(numbers); 

}
private static void task5(List<Integer> numbers){
numbers.removeIf(n -> Math.abs(n)>10 && Math.abs(n)<99); 

System.out.println(numbers); 
}
}
    
    
