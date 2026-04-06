package Task7;

public class Task7Main {
    public static void main(String[] args) {

        // Teacher object
        Teacher t = new Teacher("Mr.Seemab Shoukat", "SCD-LAB");
        t.tech();  // Teacher method

        // Student object
        Student s = new Student("Amina Fayyaz", "Software Engineering", 5033 );
        s.displayRole();  // Overridden method

        // HOD object (FIXED)
        HOD h = new HOD("Adil Butt", "Data Structures & Algorightms", "Computer Science");
        h.displayHOD();

        // Parent reference (optional concept)
        Person p = new Person("Ahmad");
        p.displayRole();
    }
}
