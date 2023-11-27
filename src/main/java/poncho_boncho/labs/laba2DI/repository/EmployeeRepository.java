package poncho_boncho.labs.laba2DI.repository;

import org.springframework.stereotype.Repository;
import poncho_boncho.labs.laba2DI.dao.Crud;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository implements Crud<Employee, Integer> {

    private List<Employee> employees;
    private static int COUNT;

    {
        employees = new ArrayList<>();
        employees.add(new Employee(++COUNT,"Makarov","Konstantin","Maksimich","central 45","IT","19.01.1997","ordinary employee"));
        employees.add(new Employee(++COUNT,"Kozlov","Artur","mihailovich","lenina 23","IT","20.09.1993","ordinary employee"));
        employees.add(new Employee(++COUNT,"Ustinova","Maria","Andreivna","Marksa 50","security","4.05.1999","ordinary employee"));
        employees.add(new Employee(++COUNT,"Volkov","Ruslan","Kostantinovich","Turgeneva 22","security","19.03.1992","ordinary employee"));
    }

    @Override
    public List<Employee> get() {
        return employees;
    }

    @Override
    public void save(Employee employee) {
        employee.setId(COUNT);
        employees.add(employee);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void remove(int id) {
        employees.remove(id);
    }

    @Override
    public void findBy(Employee entity) {

    }

    public int getCOUNT(){
        return ++COUNT;
    }
}
