package AllInOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompratoreWithStreams {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1, "Darshan" , 50000, 15),
                new Employee(2, "Jhon" , 190000, 35),
                new Employee(3, "Mike" , 5000, 45),
                new Employee(4, "Devi" , 20000, 15)
        );

                emp.stream()
                .sorted(Comparator
                .comparingInt(Employee::getAge)
                .thenComparing(Employee::getName))
                .forEach(System.out::println);

    }
}
