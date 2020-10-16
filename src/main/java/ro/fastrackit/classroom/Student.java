package ro.fastrackit.classroom;

import java.time.LocalDate;
import java.util.Date;


public class  Student implements Human
{

    public void walk() {

    }

    public boolean HumanGender() {
        return false;
    }


    public boolean gender() {
        return false;
    }
    public double getExperienceinYears() {
        return 0;
    }

    @Override
    public ScholarType getType() {
        return StudentType.BACHELOR;
    }

}
