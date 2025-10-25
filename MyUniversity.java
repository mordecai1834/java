public class MyUniversity {


    private static Person[] persons = {
        new Student("Jhon", "Halo", 2001, "Biology", "Chemistry", 1.17),
        new Student("Lone", "Wanderer", 101, "Biology", "Chemistry", 3.78),
        new Student("Alex", "Rivera", 101, "Radiology", "Quantum Chemist", 4.0),

        new instructor("Pual", "Atreides", 20011, "Political Science", 82000.00),
        new instructor("Gurney", "Hallect", 20022, "Music and Combat", 67000.00),
        new instructor("Arthur", "Dent", 42, "Intergalatic Studies", 72000.00),

        new GraduateStudent("Terry", "Code", 3001, "Software Engineering", "AI Ethics", 3.98, 28000.00),
        new GraduateStudent("BIG", "Rivers", 3002213, "Environmental Studies", "Philosophy", 3.76, 25000.00),
        new GraduateStudent("thunderdome", "Quantum", 30034124, "Physics", "Mathematics", 4.00, 30000.00)
    };

    public static void main(String[] args) {

        System.out.println("list of everyone who atteneds this university");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

        System.out.println("List of graduate Students");
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof GraduateStudent) {
                
                System.out.println(persons[i]);
            }
        }
        System.out.println("Average GPA of all students at the University");
        System.out.println(getAvgGPA());
        System.out.println("The higest paid employee is -");
        System.out.println( getHighestSalary());
        System.out.println("The higest paid employee is -");
        System.out.println(getLowestSalary());
    }

    public static double getAvgGPA() {
        double total = 0;
        int count = 0;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                Student s = (Student) persons[i];
                total += s.getGPA();
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("No students in array");
        }

        return total / count;
    }

    public static instructor getHighestSalary() {
        instructor highestPaid = null;
        double highest = 0;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof instructor) {
                instructor inst = (instructor) persons[i];
                if (inst.getSalary() > highest) {
                    highest = inst.getSalary();
                    highestPaid = inst;
                }
            }
        }

        return highestPaid;
    }
    public static instructor getLowestSalary() {
        instructor LowestPaid = null;
        double lowest = 1000000;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof instructor) {
                instructor inst = (instructor) persons[i];
                if (inst.getSalary() < lowest) {
                    lowest = inst.getSalary();
                    LowestPaid = inst;
                }
            }
        }

        return LowestPaid;
    }
}
