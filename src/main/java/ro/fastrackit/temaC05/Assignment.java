package ro.fastrackit.temaC05;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Assignment
{

    UUID UniqueID;
    int CourseNumber;
    String AssigmentTitle;
    String Assigmentdescription;
    String difficultylevel;

    public Assignment(UUID uniqueID, int courseNumber, String assigmentTitle, String assigmentdescription, String difficultylevel) {
        UniqueID = uniqueID;
        CourseNumber = courseNumber;
        AssigmentTitle = assigmentTitle;
        Assigmentdescription = assigmentdescription;
        this.difficultylevel = difficultylevel;
    }

    public UUID getUniqueID() {
        return UniqueID;
    }

    public int getCourseNumber() {
        return CourseNumber;
    }

    public String getAssigmentTitle() {
        return AssigmentTitle;
    }
    public String getAssigmentdescription() {
        return Assigmentdescription;
    }

    public String getDifficultylevel() {
        return difficultylevel;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return CourseNumber == that.CourseNumber &&
                Objects.equals(UniqueID, that.UniqueID) &&
                Objects.equals(AssigmentTitle, that.AssigmentTitle) &&
                Objects.equals(Assigmentdescription, that.Assigmentdescription) &&
                Objects.equals(difficultylevel, that.difficultylevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UniqueID, CourseNumber, AssigmentTitle, Assigmentdescription, difficultylevel);
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "UniqueID=" + UniqueID +
                ", CourseNumber=" + CourseNumber +
                ", AssigmentTitle='" + AssigmentTitle + '\'' +
                ", Assigmentdescription='" + Assigmentdescription + '\'' +
                ", difficultylevel='" + difficultylevel + '\'' +
                '}';
    }


}
