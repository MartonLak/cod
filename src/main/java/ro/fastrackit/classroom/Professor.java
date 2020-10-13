package ro.fastrackit.classroom;

import com.sun.source.tree.WhileLoopTree;

import java.time.LocalDate;

class Professor {
    String lastName;
    String firstName;
    LocalDate DateofBirth;
    LocalDate Dateofhiring;
    String emailAddress;
    Boolean PHD;

    public Professor(String lastName, String firstName, Boolean PHD) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.PHD = PHD;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Boolean getPHD() {
        return PHD;
    }

    public void horn() {
        System.out.println("Baaaamp");
    }
}

class PHDProfessor extends Professor {
    public PHDProfessor(String lastName, String firstName, Boolean PHD) {
        super(lastName, firstName, PHD);
    }

    @Override
    public Boolean getPHD() {
        return super.getPHD();
    }

    public static void main(String[] args) {

    }
}
