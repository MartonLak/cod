package ro.fastrackit.temaC05;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Assignment test1= new Assignment(java.util.UUID.randomUUID(),2,"java","runclass","2medium");
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
        assignmenttest.put("2"+"2medium",test1);
        assignmenttest.put("3"+"2medium",test1);

        System.out.println(assignmenttest.get("2"+"2medium"));


    }
}
