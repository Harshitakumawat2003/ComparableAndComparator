package sort1_comparator;
//
//import sort.Emp;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class SortExample1 {
//
//
//    public static void main(String[] args) {
//        ArrayList<sort.Emp> emps = new ArrayList<>();
//        emps.add(new sort.Emp("Harshita","8989787867",2));
//        emps.add(new sort.Emp("Joker","7878785645",1));
//        emps.add(new Emp("Ram","7878890645",90));
//        System.out.println(emps);
//        Collections.sort(emps, new IdComparator1());
////        Comparable
//        System.out.println(emps);
//
//
//    }
//}




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortExample1 {

    public static void main(String[] args) {
        ArrayList<Emp1> emps = new ArrayList<>();
        emps.add(new Emp1("Harshita","8989787867",2));
        emps.add(new Emp1("Joker","7878785645",1));
        emps.add(new Emp1("Ram","7878890645",90));

        System.out.println("Before sorting: " + emps);

        // Correctly apply the Comparator
        Collections.sort(emps, new IdComparator1());

        System.out.println("After sorting by id: " + emps);
        System.out.println("sorting by name");
        ArrayList<Emp1> emp1 = new ArrayList<>(emps);
        Collections.sort(emp1, new NameComparator());
        System.out.println(emp1);
    }
}