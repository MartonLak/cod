package ro.fastrackit.classroom;

import java.time.LocalDate;
import java.util.Date;


public class Student {

    String lastName;
    String firstName;
    LocalDate DateofBirth;
    String emailAddress;
    Float grade;
    Boolean hasfinished;

    public Student(String lastName, String firstName, LocalDate dateofBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        DateofBirth = dateofBirth;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Boolean getHasfinished() {
        return hasfinished;
    }

    public void setHasfinished(Boolean hasfinished) {
        this.hasfinished = hasfinished;
    }

    static void myStaticMethod() {

        Student stud1 = new Student("Jon", "Smith", LocalDate.now());
        System.out.println(stud1.DateofBirth);
        System.out.println(stud1.lastName);
        System.out.println(stud1.firstName);
        stud1.grade = 12f;
        stud1.emailAddress = "m.marci56@yahoo.com";
    }

    static void myStaticMethod2() {

    }


    public static void main(String[] args) {
        myStaticMethod();

    }


}
