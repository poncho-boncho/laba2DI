package poncho_boncho.labs.laba2DI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poncho_boncho.labs.laba2DI.view.InterfaceApp;

@Service
public class AppService {
    private final EmployeeService employeeService;
    private final InterfaceApp interfaceApp;

    public AppService(EmployeeService employeeService,
                      InterfaceApp interfaceApp){
        this.employeeService = employeeService;
        this.interfaceApp = interfaceApp;
        interfaceApp.meny();
    }
}
