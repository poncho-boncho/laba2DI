package poncho_boncho.labs.laba2DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import poncho_boncho.labs.laba2DI.repository.Employee;
import poncho_boncho.labs.laba2DI.repository.EmployeeRepository;
import poncho_boncho.labs.laba2DI.services.AppService;
import poncho_boncho.labs.laba2DI.services.EmployeeService;
import poncho_boncho.labs.laba2DI.view.InterfaceApp;

@Configuration
@EnableTransactionManagement
//путь до компанентов
public class JavaConfig {

    @Bean
    EmployeeService employeeService(){
        return new EmployeeService(employeeRepository());
    }
    @Bean
    InterfaceApp interfaceApp(){
        return new InterfaceApp(employeeService());
    }
    @Bean
    AppService appService(){
        return new AppService(employeeService(), interfaceApp());
    }

    @Bean
    EmployeeRepository employeeRepository(){
        return new EmployeeRepository() {
        };
    }
}
