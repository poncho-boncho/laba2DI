package poncho_boncho.labs.laba2DI.repository;

import org.springframework.stereotype.Repository;
import poncho_boncho.labs.laba2DI.dao.Crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class DepartmentRepository implements Crud<Department, Integer> {

    private List<Department> departments;

    private static int COUNT;

    {
        departments = new ArrayList<>();

        departments.add(new Department(++COUNT, "Security", 2, Arrays.asList("Rum№ 4","Rum№ 24")));
        departments.add(new Department(++COUNT, "IT", 2, Arrays.asList("Rum№ 16","Rum№ 48")));
        departments.add(new Department(++COUNT, "HR", 1, Arrays.asList("Rum№ 5")));
        departments.add(new Department(++COUNT, "Marketing ", 3, Arrays.asList("Rum№ 8","Rum№ 88","Rum№ 888")));
    }

    @Override
    public List<Department> get() {
        return departments;
    }

    @Override
    public void save(Department department) {
        department.setId(COUNT);
        departments.add(department);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void remove(int id) {
        departments.remove(id);
    }

    @Override
    public void findBy(Department entity) {

    }

    public int getCOUNT(){
        return ++COUNT;
    }
}
