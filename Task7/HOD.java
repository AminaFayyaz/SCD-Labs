package Task7;

class HOD extends Teacher {

    String department;

    HOD(String name, String subject, String department) {
        super(name, subject);  // Teacher ka constructor call
        this.department = department;
    }

    void displayHOD() {
        System.out.println(name + " is HOD of " + department + 
                           " department and teaches " + Subject);
    }
}