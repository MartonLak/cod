package ro.training.java.c07;

public class Student extends Human {

    String school;

    public Student(String name, Integer age,String school) {
        super(name, age);
        this.school=school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


}
