package poncho_boncho.labs.laba2DI.view;

import org.springframework.stereotype.Component;
import poncho_boncho.labs.laba2DI.services.AppService;
import poncho_boncho.labs.laba2DI.services.EmployeeService;

import java.util.Scanner;

@Component
public class InterfaceApp {

    private final EmployeeService employeeService;

    Scanner in = new Scanner(System.in);
    int num;

    public InterfaceApp(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void meny(){
        System.out.println("1 - Pokazat tablicu \n" +
                "9 - zavershit programmu");
        while (num !=9){
            num = in.nextInt();
            if (num ==1){
                System.out.println(employeeService.getEmployeeAll());
            }
        }
    }
}
