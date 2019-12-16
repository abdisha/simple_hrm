package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * EmployeeInfo
 */
@Document
public class EmployeeLimitedInfo {
    private String id;
    private Binary profileImage;
    private String employeeId;
    private String fullName;
    private String sex;
    private int age;
    private boolean status;


    

    public EmployeeLimitedInfo() {
    }

    public EmployeeLimitedInfo(String id, Binary binary, String employeeId, String fullName, String sex, int age, boolean status) {
        this.id = id;
        this.profileImage = binary;
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
        this.status = status;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Binary getProfileImage() {
        return this.profileImage;
    }

    public void setProfileImage(Binary profileImage) {
        this.profileImage = profileImage;
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

    public EmployeeLimitedInfo id(String id) {
        this.id = id;
        return this;
    }

    public EmployeeLimitedInfo profileImage(Binary profileImage) {
        this.profileImage = profileImage;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmployeeLimitedInfo)) {
            return false;
        }
        EmployeeLimitedInfo employeeLimitedInfo = (EmployeeLimitedInfo) o;
        return Objects.equals(id, employeeLimitedInfo.id) && Objects.equals(profileImage, employeeLimitedInfo.profileImage) && Objects.equals(employeeId, employeeLimitedInfo.employeeId) && Objects.equals(fullName, employeeLimitedInfo.fullName) && Objects.equals(sex, employeeLimitedInfo.sex) && age == employeeLimitedInfo.age && status == employeeLimitedInfo.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, profileImage, employeeId, fullName, sex, age, status);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", profileImage='" + getProfileImage() + "'" +
            ", employeeId='" + getEmployeeId() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", sex='" + getSex() + "'" +
            ", age='" + getAge() + "'" +
            ", status='" + isStatus() + "'" +
            "}";
    }
    

}
