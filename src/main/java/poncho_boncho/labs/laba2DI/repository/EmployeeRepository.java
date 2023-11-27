package poncho_boncho.labs.laba2DI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import poncho_boncho.labs.laba2DI.dao.Crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository implements Crud<Employee> {

    private List<Employee> employees;
    private static int COUNT;

    {
        employees = new ArrayList<>();
        employees.add(new Employee(++COUNT,"2","3","4","5","6"));
        employees.add(new Employee(++COUNT,"2","3","4","5","6"));
        employees.add(new Employee(++COUNT,"2","3","4","5","6"));
        employees.add(new Employee(++COUNT,"2","3","4","5","6"));
    }

    @Override
    public List<Employee> get() {
        return employees;
    }
}
