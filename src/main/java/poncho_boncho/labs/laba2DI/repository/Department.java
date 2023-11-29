package poncho_boncho.labs.laba2DI.repository;

import java.util.List;

public class Department {

        private int id;
        private String name;

        private Integer employeNumbers;

        private List<String> listRomms;

    public Department(int id, String name, Integer employeNumbers, List<String> listRomms) {
        this.id = id;
        this.name = name;
        this.employeNumbers = employeNumbers;
        this.listRomms = listRomms;
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getEmployeNumbers() {
            return employeNumbers;
        }

        public void setEmployeNumbers(Integer employeNumbers) {
            this.employeNumbers = employeNumbers;
        }

    public List<String> getListRomms() {
        return listRomms;
    }

    public void setListRomms(List<String> listRomms) {
        this.listRomms = listRomms;
    }

    public Integer getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
