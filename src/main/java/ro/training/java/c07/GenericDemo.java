package ro.training.java.c07;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GenericDemo

{


    public  static List<Student> createList()
    {
        List<Student> students= new ArrayList<>();
        students.add(new Student("John",12,"UTCN"));
        students.add(new Student("Johnny",22,"UBB"));
        return students;
    }
    public static void main(String[] args)
    {
        List<Human> humans= createList().stream().map(student -> toHuman(student)).collect(Collectors.toList());
        //am creat o metod pentru cu daca puneam doar List<Human> humans= createList() aveam erroare; ca cerea Student doar eu aveam Human
        System.out.println(humans);


    }
    public  static Human toHuman(Student student)
    {
        return student;
    }
}
