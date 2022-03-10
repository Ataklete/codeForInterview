import java.util.*;


// return an average salary from a list of employee
public class Average {
    public static void main(String[] args) {

        Employee employee1 = new Employee("ati", 100);
        Employee employee2 = new Employee("ati", 200);
        Employee employee3 = new Employee("haile", 300);
        Employee employee4 = new Employee("Teffera", 400);
        Employee employee5 = new Employee("Teffera", 500);

        List<Employee> emp = Arrays.asList(employee1,employee2,employee3,employee4,employee5);

        Map<String, Double> map = new HashMap<>();

        for (Employee e : emp) {
            if (!map.containsKey(e.getName())){
                map.put(e.getName(),e.getSalary());
            }else {
                map.put(e.getName(), e.getSalary() + map.get(e.getName()));
            }
        }
        double sum = 0;
        for(Map.Entry<String,Double> a : map.entrySet()){
            sum += a.getValue();
        }
        System.out.println("average:  " + sum/map.size());
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
