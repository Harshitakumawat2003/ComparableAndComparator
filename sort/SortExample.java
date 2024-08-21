//Progeame for Comparable

package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Harshita","8989787867",2));
        emps.add(new Emp("Joker","7878785645",1));
        emps.add(new Emp("Ram","7878890645",90));
        System.out.println(emps);
        Collections.sort(emps);
//        Comparable
        System.out.println(emps);


    }
}
