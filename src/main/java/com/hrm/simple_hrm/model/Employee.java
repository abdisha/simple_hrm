package com.hrm.simple_hrm.model;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Employee
 */
@Document("Employee")
public class Employee {
    @Id
    private String id;
    private String employeeId;
    private String fullName;
    private String sex;
    private int age;
    private boolean status;
    private String phone;
    private String email;
    private String address;
    private String birthDate;
    private String typOfEmployement;
    private String dateOfEmployement;
    private Position position;
    private List<Education> education;
    private List<Exprience> exprience;
    private Departement departement;
    private List<DisplenaryMeasure> displenaryMeasures;
    private double basicSalary;
    private List<LeaveTaken> LeaveTaken;

    public Employee() {
    }

    public Employee(String id, String employeeId, String fullName, String sex, int age, boolean status, String phone, String email, String address, String birthDate, String typOfEmployement, String dateOfEmployement, Position position, List<Education> education, List<Exprience> exprience, Departement departement, List<DisplenaryMeasure> displenaryMeasures, double basicSalary, List<LeaveTaken> LeaveTaken) {
        this.id = id;
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
        this.status = status;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.typOfEmployement = typOfEmployement;
        this.dateOfEmployement = dateOfEmployement;
        this.position = position;
        this.education = education;
        this.exprience = exprience;
        this.departement = departement;
        this.displenaryMeasures = displenaryMeasures;
        this.basicSalary = basicSalary;
        this.LeaveTaken = LeaveTaken;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getTypOfEmployement() {
        return this.typOfEmployement;
    }

    public void setTypOfEmployement(String typOfEmployement) {
        this.typOfEmployement = typOfEmployement;
    }

    public String getDateOfEmployement() {
        return this.dateOfEmployement;
    }

    public void setDateOfEmployement(String dateOfEmployement) {
        this.dateOfEmployement = dateOfEmployement;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Education> getEducation() {
        return this.education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Exprience> getExprience() {
        return this.exprience;
    }

    public void setExprience(List<Exprience> exprience) {
        this.exprience = exprience;
    }

    public Departement getDepartement() {
        return this.departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public List<DisplenaryMeasure> getDisplenaryMeasures() {
        return this.displenaryMeasures;
    }

    public void setDisplenaryMeasures(List<DisplenaryMeasure> displenaryMeasures) {
        this.displenaryMeasures = displenaryMeasures;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public List<LeaveTaken> getLeaveTaken() {
        return this.LeaveTaken;
    }

    public void setLeaveTaken(List<LeaveTaken> LeaveTaken) {
        this.LeaveTaken = LeaveTaken;
    }

    public Employee id(String id) {
        this.id = id;
        return this;
    }

    public Employee employeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Employee fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Employee sex(String sex) {
        this.sex = sex;
        return this;
    }

    public Employee age(int age) {
        this.age = age;
        return this;
    }

    public Employee status(boolean status) {
        this.status = status;
        return this;
    }

    public Employee phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Employee email(String email) {
        this.email = email;
        return this;
    }

    public Employee address(String address) {
        this.address = address;
        return this;
    }

    public Employee birthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Employee typOfEmployement(String typOfEmployement) {
        this.typOfEmployement = typOfEmployement;
        return this;
    }

    public Employee dateOfEmployement(String dateOfEmployement) {
        this.dateOfEmployement = dateOfEmployement;
        return this;
    }

    public Employee position(Position position) {
        this.position = position;
        return this;
    }

    public Employee education(List<Education> education) {
        this.education = education;
        return this;
    }

    public Employee exprience(List<Exprience> exprience) {
        this.exprience = exprience;
        return this;
    }

    public Employee departement(Departement departement) {
        this.departement = departement;
        return this;
    }

    public Employee displenaryMeasures(List<DisplenaryMeasure> displenaryMeasures) {
        this.displenaryMeasures = displenaryMeasures;
        return this;
    }

    public Employee basicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
        return this;
    }

    public Employee LeaveTaken(List<LeaveTaken> LeaveTaken) {
        this.LeaveTaken = LeaveTaken;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(employeeId, employee.employeeId) && Objects.equals(fullName, employee.fullName) && Objects.equals(sex, employee.sex) && age == employee.age && status == employee.status && Objects.equals(phone, employee.phone) && Objects.equals(email, employee.email) && Objects.equals(address, employee.address) && Objects.equals(birthDate, employee.birthDate) && Objects.equals(typOfEmployement, employee.typOfEmployement) && Objects.equals(dateOfEmployement, employee.dateOfEmployement) && Objects.equals(position, employee.position) && Objects.equals(education, employee.education) && Objects.equals(exprience, employee.exprience) && Objects.equals(departement, employee.departement) && Objects.equals(displenaryMeasures, employee.displenaryMeasures) && basicSalary == employee.basicSalary && Objects.equals(LeaveTaken, employee.LeaveTaken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, fullName, sex, age, status, phone, email, address, birthDate, typOfEmployement, dateOfEmployement, position, education, exprience, departement, displenaryMeasures, basicSalary, LeaveTaken);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", employeeId='" + getEmployeeId() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", sex='" + getSex() + "'" +
            ", age='" + getAge() + "'" +
            ", status='" + isStatus() + "'" +
            ", phone='" + getPhone() + "'" +
            ", email='" + getEmail() + "'" +
            ", address='" + getAddress() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", typOfEmployement='" + getTypOfEmployement() + "'" +
            ", dateOfEmployement='" + getDateOfEmployement() + "'" +
            ", position='" + getPosition() + "'" +
            ", education='" + getEducation() + "'" +
            ", exprience='" + getExprience() + "'" +
            ", departement='" + getDepartement() + "'" +
            ", displenaryMeasures='" + getDisplenaryMeasures() + "'" +
            ", basicSalary='" + getBasicSalary() + "'" +
            ", LeaveTaken='" + getLeaveTaken() + "'" +
            "}";
    }




   
}