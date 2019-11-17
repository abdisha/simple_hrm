package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * EmployeeInfo
 */
@Document
public class EmployeeLimitedInfo {
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

    

    public EmployeeLimitedInfo() {
    }

    public EmployeeLimitedInfo(String id, String employeeId, String fullName, String sex, int age, boolean status, String phone, String email, String address, String birthDate) {
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

    public EmployeeLimitedInfo id(String id) {
        this.id = id;
        return this;
    }

    public EmployeeLimitedInfo employeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeLimitedInfo fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public EmployeeLimitedInfo sex(String sex) {
        this.sex = sex;
        return this;
    }

    public EmployeeLimitedInfo age(int age) {
        this.age = age;
        return this;
    }

    public EmployeeLimitedInfo status(boolean status) {
        this.status = status;
        return this;
    }

    public EmployeeLimitedInfo phone(String phone) {
        this.phone = phone;
        return this;
    }

    public EmployeeLimitedInfo email(String email) {
        this.email = email;
        return this;
    }

    public EmployeeLimitedInfo address(String address) {
        this.address = address;
        return this;
    }

    public EmployeeLimitedInfo birthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeLimitedInfo)) {
            return false;
        }
        EmployeeLimitedInfo employeeLimitedInfo = (EmployeeLimitedInfo) o;
        return Objects.equals(id, employeeLimitedInfo.id) && Objects.equals(employeeId, employeeLimitedInfo.employeeId) && Objects.equals(fullName, employeeLimitedInfo.fullName) && Objects.equals(sex, employeeLimitedInfo.sex) && age == employeeLimitedInfo.age && status == employeeLimitedInfo.status && Objects.equals(phone, employeeLimitedInfo.phone) && Objects.equals(email, employeeLimitedInfo.email) && Objects.equals(address, employeeLimitedInfo.address) && Objects.equals(birthDate, employeeLimitedInfo.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, fullName, sex, age, status, phone, email, address, birthDate);
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
            "}";
    }
}
