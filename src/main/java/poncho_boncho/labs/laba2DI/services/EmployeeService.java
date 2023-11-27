package poncho_boncho.labs.laba2DI.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import poncho_boncho.labs.laba2DI.repository.Employee;
import poncho_boncho.labs.laba2DI.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public String getEmployeeAll(){
        StringBuilder qwerty = new StringBuilder();
        for (Employee emploe: employeeRepository.get()){
            qwerty.append("ID = ").append(emploe.getId());
            qwerty.append("\tFIO = "+emploe.getFio());
            qwerty.append("\tAddress = "+emploe.getAddress());
            qwerty.append("\tDepartament = "+emploe.getDepartment());
            qwerty.append("\tPost = "+emploe.getPost());
            qwerty.append("\tBirthDay = " +emploe.getBirthDay());
            qwerty.append("\n");
        }
        return qwerty.toString();
    }

}
