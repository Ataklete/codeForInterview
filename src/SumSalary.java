import objects.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumSalary {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("Jhon", 30, 1000),
                new Employee("King", 30, 2000),
                new Employee("King", 30, 2000),
                new Employee("Shara", 30, 3000),
                new Employee("Elena", 30, 4000));

        System.out.println(emp.stream().filter(x -> x.getAge() > 10).map(Employee::getSalary).reduce(0, (x, y) -> x + y));
        System.out.println(emp.stream().map(Employee::getName).collect(Collectors.joining(",")));
        System.out.println(emp.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.summingInt(Employee::getSalary))));

        // creating a list of Strings
        List<String> words = Arrays.asList("ati", "haile", "for",
                "atiTeffera", "teffera");

        // reduce() is called may be empty.f
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        longestString.ifPresent(System.out::println);
        System.out.println(words.stream().reduce("",(x, y)-> x + " " + y));
    }
}
