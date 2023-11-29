package poncho_boncho.labs.laba2DI.services;

import org.springframework.stereotype.Service;
import poncho_boncho.labs.laba2DI.repository.Department;
import poncho_boncho.labs.laba2DI.repository.DepartmentRepository;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    public String getDepormentAll(){
        StringBuilder qwerty = new StringBuilder();
        for(Department department: departmentRepository.get()){
            qwerty.append("ID = ").append(department.getId());
            qwerty.append("\tName = "+department.getName());
            qwerty.append("\t EmployeNumbers = "+department.getEmployeNumbers());
            qwerty.append("\t ListRomms = "+department.getListRomms());
            qwerty.append("\n");
        }
        return qwerty.toString();
    }

    public void create(
            String name,
            Integer employeNumbers,
            List<String> listRomms
    ){
        departmentRepository.save(new Department(departmentRepository.getCOUNT(),name,employeNumbers, listRomms));
    }
}
