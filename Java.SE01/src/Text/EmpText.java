package Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpText {
    public static void main(String[] args) {

        List<Emp> emps = new ArrayList<Emp>();


        emps.add(new Emp(19,3000,"李四"));
        emps.add(new Emp(19,2400,"张松"));
        emps.add(new Emp(19,9400,"小二"));
        emps.add(new Emp(19,4000,"王五"));

        System.out.println(emps);


        Comparator<Emp> comparator = new Comparator<Emp>() {

            public int compare(Emp o1, Emp o2) {
                return o1.salary-o2.salary;
            }
        };

        Collections.sort(emps,comparator);

        System.out.println(emps);

    }
}

