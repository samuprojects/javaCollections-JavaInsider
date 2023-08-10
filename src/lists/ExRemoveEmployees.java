package lists;

import java.util.ArrayList;
import java.util.List;

import static lists.Employee.Status.ACTIVE;
import static lists.Employee.Status.INACTIVE;

@SuppressWarnings("ALL")
public class ExRemoveEmployees {

    public static void main(String[] args) {
        var employees = List.of(
                new Employee("Emp A", ACTIVE),
                new Employee("Emp B", INACTIVE),
                new Employee("Emp C", ACTIVE),
                new Employee("Emp D", INACTIVE),
                new Employee("Emp E", INACTIVE),
                new Employee("Emp F", ACTIVE)
        );

        var activeEmployees = removeInactive((employees));
        System.out.println(employees);
        System.out.println(activeEmployees);
    }

    // recebe uma lista employee e retorna uma nova com os funcionarios inativos removidos
    private static List<Employee> removeInactive(List<Employee> employees) {
        var activeEmployees = new ArrayList<Employee>();
        activeEmployees.addAll(employees);

        var iter = activeEmployees.iterator();
        while (iter.hasNext()){
            Employee e = iter.next();
            if (e.getStatus() == INACTIVE){
                iter.remove();
            }
        }

        return activeEmployees;
    }
}
