package poncho_boncho.labs.laba2DI.view;

import org.springframework.stereotype.Component;
import poncho_boncho.labs.laba2DI.services.DepartmentService;
import poncho_boncho.labs.laba2DI.services.EmployeeService;

import java.util.*;

@Component
public class InterfaceApp {

    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    private List<String> attributes;

    Scanner in = new Scanner(System.in);
    int num;

    public InterfaceApp(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }
    public List<String> initForCreation(String nameEntity){



        if (nameEntity.equals("employee")) {
            attributes = new ArrayList<>();
            System.out.println("input: Last name");
            attributes.add(in.next());
            System.out.println("input name");
            attributes.add(in.next());
            System.out.println("input midle name");
            attributes.add(in.next());
            System.out.println("input address");
            attributes.add(in.next());
            System.out.println("input department");
            attributes.add(in.next());
            System.out.println("input birthDay");
            attributes.add(in.next());
            System.out.println("input post");
            attributes.add(in.next());
        }
        else{
            attributes = new ArrayList<>();
            System.out.println("input: name");
            attributes.add(in.next());
            System.out.println("input: employeNumbers");
            attributes.add(in.next());
            System.out.println("input: listRomms");
            in.nextLine();
            String str = in.nextLine();
            attributes.add(str);
        }

        return attributes;
    }

    public void inform(){
        System.out.println("1 - Pokazat tablicu Employee \n" +
                "2 - Sozdat Employee\n" +
                "3 - Udalit zapis o Employee\n"+
                "4 - Nayti zapis po pervim bukvam LastName \n"+
                "5 - Pokazat tablicu Departament \n"+
                "6 - Sozdat Deportment \n"+
                "7 - Udalit zapis o Department \n"+
                "8 - Nayti zapis po pervim bukvam name (Department) \n"+
                "9 - zavershit programmu");
    }

    public void meny(){
        while (num !=9){
            inform();
            num = in.nextInt();
            if (num == 1){
                System.out.println(employeeService.getEmployeeAll());
            }
            if(num == 2){
                initForCreation("employee");
                employeeService.create(
                        attributes.get(0),
                        attributes.get(1),
                        attributes.get(2),
                        attributes.get(3),
                        attributes.get(4),
                        attributes.get(5),
                        attributes.get(6));
            }
            if (num == 3){
                System.out.println("Vvedi index atributa na udalenie");
                employeeService.deleteByIndex(Integer.parseInt(in.next())-1);
            }
            if (num == 4){
                System.out.println("Vvedi na cho nachinaetsy lastName");
                System.out.println(employeeService.getFindEmployee(in.next()));
            }
            if (num == 5){
                System.out.println(departmentService.getDepormentAll());
            }
            if(num == 6){
                initForCreation("deportment");
                departmentService.create(
                        attributes.get(0),
                        Integer.parseInt(attributes.get(1)),
                        Arrays.asList(attributes.get(2).split(" "))
                );
            }
            if (num == 7){
                System.out.println("Vvedi index atributa na udalenie");
                departmentService.deleteByIndex(Integer.parseInt(in.next())-1);
            }
            if (num == 8){
                System.out.println("Vvedi na chto nachinaetsy name department");
                System.out.println(departmentService.getFindDepartment(in.next()));
            }
        }
    }
}
