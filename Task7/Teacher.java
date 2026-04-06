package Task7;

public class Teacher extends Person {
    String Subject;
    public Teacher(String name,String Subject){
        super(name);
        this.Subject=Subject;

    }
    public void tech(){
        System.out.println(name + " is teaching " + Subject);
    }
}