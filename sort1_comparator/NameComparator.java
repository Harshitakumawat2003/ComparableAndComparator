package sort1_comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp1> {

public int compare(Emp1 o1, Emp1 o2){
    return o1.getName().compareTo(o2.getName());
}
}
