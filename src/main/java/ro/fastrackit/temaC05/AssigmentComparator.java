package ro.fastrackit.temaC05;

import java.util.Comparator;

 class AssigmentComparator1 implements Comparator<Assignment> {

    @Override
    public int compare(Assignment o1, Assignment o2)
    {
                return Integer.compare(o1.getCourseNumber(),o2.getCourseNumber());
    }
}
