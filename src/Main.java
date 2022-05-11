import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1,"Ashish",25000,"fullStackDeveloper"));
        employees.add(new Employee(2,"Krushna",26000,"javaDeveloper"));
        employees.add(new Employee(3,"Vaibhav",30000,"frontEndDeveloper"));
        employees.add(new Employee(4,"Purushottam",30000,"frontEndDeveloper"));
        employees.add(new Employee(5,"Bhagyashree",25000,"backendDeveloper"));
        employees.add(new Employee(6,"Rachana",26000,"pythonDeveloper"));
        employees.add(new Employee(7,"Dharmaraj",25000,"fullStackDeveloper"));
        employees.add(new Employee(8,"Ganesh",30000,"frontEndDeveloper"));
        employees.add(new Employee(9,"Narendra",30000,"javaDeveloper"));
        employees.add(new Employee(10,"Sunidhi",30000,"backendDeveloper"));

        Collections.sort(employees, new SortGarden());
        System.out.println(employees);

    }
}