package ro.fastrackit.temaC05;

import java.util.Comparator;

 class AssigmentComparator2 implements Comparator<Assignment> {


    @Override
    public int compare(Assignment o1, Assignment o2)
    {
            return o1.getDifficultylevel().compareTo(o2.getDifficultylevel());
    }
}
