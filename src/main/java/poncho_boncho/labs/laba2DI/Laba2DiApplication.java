package poncho_boncho.labs.laba2DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import poncho_boncho.labs.laba2DI.repository.Employee;
import poncho_boncho.labs.laba2DI.services.AppService;
import poncho_boncho.labs.laba2DI.services.EmployeeService;
import poncho_boncho.labs.laba2DI.view.InterfaceApp;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Laba2DiApplication {
	private final AppService appService;
	public Laba2DiApplication (AppService appService){
		this.appService = appService;
	}


	public static void main(String[] args) {

		SpringApplication.run(Laba2DiApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfig.class
		);
		//AppService appService = context.getBean("appService",AppService.class);

		//EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		//System.out.println(employeeService.getEmployeeAll());
	}


}
