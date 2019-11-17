package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Position
 */
@Document("Position")
public class Position {

    @Id
    private String id;
    private String positionName;
    private String positionDesc;
    private double salary;
    private String crtDt;
    private String lmDt;

    public Position() {
    }

    public Position(String id, String positionName, String positionDesc, double salary, String crtDt, String lmDt) {
        this.id = id;
        this.positionName = positionName;
        this.positionDesc = positionDesc;
        this.salary = salary;
        this.crtDt = crtDt;
        this.lmDt = lmDt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionDesc() {
        return this.positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCrtDt() {
        return this.crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public String getLmDt() {
        return this.lmDt;
    }

    public void setLmDt(String lmDt) {
        this.lmDt = lmDt;
    }

    public Position id(String id) {
        this.id = id;
        return this;
    }

    public Position positionName(String positionName) {
        this.positionName = positionName;
        return this;
    }

    public Position positionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
        return this;
    }

    public Position salary(double salary) {
        this.salary = salary;
        return this;
    }

    public Position crtDt(String crtDt) {
        this.crtDt = crtDt;
        return this;
    }

    public Position lmDt(String lmDt) {
        this.lmDt = lmDt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Position)) {
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(id, position.id) && Objects.equals(positionName, position.positionName) && Objects.equals(positionDesc, position.positionDesc) && salary == position.salary && Objects.equals(crtDt, position.crtDt) && Objects.equals(lmDt, position.lmDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positionName, positionDesc, salary, crtDt, lmDt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", positionName='" + getPositionName() + "'" +
            ", positionDesc='" + getPositionDesc() + "'" +
            ", salary='" + getSalary() + "'" +
            ", crtDt='" + getCrtDt() + "'" +
            ", lmDt='" + getLmDt() + "'" +
            "}";
    }

}