package poncho_boncho.labs.laba2DI.view;

import org.springframework.stereotype.Component;
import poncho_boncho.labs.laba2DI.services.AppService;
import poncho_boncho.labs.laba2DI.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class InterfaceApp {

    private final EmployeeService employeeService;

    private List<String> attributes;

    Scanner in = new Scanner(System.in);
    int num;

    public InterfaceApp(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    public List<String> initForCreation(){
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
        return attributes;
    }

    public void inform(){
        System.out.println("1 - Pokazat tablicu \n" +
                "2 - Sozdat Employee\n" +
                "3 - Udalit zapis o Employee\n"+
                "4 - Nayti zapis po pervim bukvam LastName"+
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
                initForCreation();
                employeeService.create(1,
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
        }
    }
}
