package ro.fastrackit.temaC05;

import java.util.Comparator;

 class AssigmentComparator3 implements Comparator<Assignment>
{


    @Override
    public int compare(Assignment o1, Assignment o2) {
        return o1.getAssigmentTitle().compareTo(o2.getAssigmentTitle());
    }
}
