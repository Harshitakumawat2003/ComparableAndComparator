package sort1_comparator;

import java.util.Comparator;

public class IdComparator1 implements Comparator<Emp1> {
    public int compare(Emp1 o1, Emp1 o2){
        return o1.getempId()-o2.getempId();
    }
}
