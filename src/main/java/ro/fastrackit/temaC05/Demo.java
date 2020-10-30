package ro.fastrackit.temaC05;

import java.util.*;
import  java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {

        Assignment test1= new Assignment(java.util.UUID.randomUUID(),2,"java","runclass","3hard");
        Assignment test2= new Assignment(java.util.UUID.randomUUID(),1,"pyhton","testalghoritms","1easy");
        Assignment test3= new Assignment(java.util.UUID.randomUUID(),3,"C++","complexcalculator","2medium");

        List<Assignment> assignments = new ArrayList<>();
        assignments.add(test1);
        assignments.add(test2);
        assignments.add(test3);

         //   System.out.println("Before Sorting:" + assignments);
           AssigmentComparator1 comparator1 = new AssigmentComparator1();
            AssigmentComparator2 comparator2 = new AssigmentComparator2();
             AssigmentComparator3 comparator3 = new AssigmentComparator3();
            Collections.sort(assignments,comparator1);
       // System.out.println("SortingafterCourseNumber:" + assignments);
        Collections.sort(assignments,comparator2);
        //System.out.println("SortingafterDifficultyLevel:" + assignments);
        Collections.sort(assignments,comparator3);
        //System.out.println("SortingafterAssignmentTitle:" + assignments);

        HashMap<String, Assignment> assignmenttest= new HashMap<String, Assignment>();
        assignmenttest.put("1"+"1easy",test1);
        assignmenttest.put("2"+"2medium",test2);
        assignmenttest.put("3"+"2medium",test3);
        //Using a List<Assignments> as input, use streams and map() to create a List<String> with only their unique IDs.
        List<UUID> uniqueIds=assignments.stream().map(Assignment ->Assignment.getUniqueID()).collect(Collectors.toList());
            System.out.println(uniqueIds);
        //Using a List<Assignments> as input, use streams to return a List<Assignments> filtered to have only Difficulty Levels equal to Easy or Medium.
        List<String> filterlever1=assignments.stream().filter(Assignment->Assignment.difficultylevel.equals("1easy") || Assignment.difficultylevel.equals("2medium")).map(Assignment ->Assignment.getAssigmentTitle()).collect(Collectors.toList());
        System.out.println(filterlever1);
        //Using a List<Assignments> as input, use streams to return a HashMap having unique IDs as Keys and Assignments as values. The expected output type will be HashMap<String, Assignment>.
        Map<UUID, Assignment>  uniqueIDsasKeysnd = assignments.stream().collect(Collectors.toMap(Assignment::getUniqueID,Function.identity()));
        System.out.println(uniqueIDsasKeysnd);


    }
}
