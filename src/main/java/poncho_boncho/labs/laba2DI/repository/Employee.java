package poncho_boncho.labs.laba2DI.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

public class Employee {
    private Integer id;

    private String fio;

    private String address;

    private String department;

    private String birthDay;

    private String post;

    public Integer getId() {
        return id;
    }

    public Employee(Integer id, String fio, String address, String department, String birthDay, String post) {
        this.id = id;
        this.fio = fio;
        this.address = address;
        this.department = department;
        this.birthDay = birthDay;
        this.post = post;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPost() {
        return post;
    }

    public void create(){

    }

    public void setPost(String post) {
        this.post = post;
    }}

