package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * DisplenaryMeasure
 */
public class DisplenaryMeasure {

    @Id
    private String id;
    private String Name;
    private String description;
    private String Date;
    private double salary;
    private double percent;

    public DisplenaryMeasure() {
    }

    public DisplenaryMeasure(String id, String Name, String description, String Date, double salary, double percent) {
        this.id = id;
        this.Name = Name;
        this.description = description;
        this.Date = Date;
        this.salary = salary;
        this.percent = percent;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPercent() {
        return this.percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public DisplenaryMeasure id(String id) {
        this.id = id;
        return this;
    }

    public DisplenaryMeasure Name(String Name) {
        this.Name = Name;
        return this;
    }

    public DisplenaryMeasure description(String description) {
        this.description = description;
        return this;
    }

    public DisplenaryMeasure Date(String Date) {
        this.Date = Date;
        return this;
    }

    public DisplenaryMeasure salary(double salary) {
        this.salary = salary;
        return this;
    }

    public DisplenaryMeasure percent(double percent) {
        this.percent = percent;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DisplenaryMeasure)) {
            return false;
        }
        DisplenaryMeasure displenaryMeasure = (DisplenaryMeasure) o;
        return Objects.equals(id, displenaryMeasure.id) && Objects.equals(Name, displenaryMeasure.Name) && Objects.equals(description, displenaryMeasure.description) && Objects.equals(Date, displenaryMeasure.Date) && salary == displenaryMeasure.salary && percent == displenaryMeasure.percent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, description, Date, salary, percent);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", Name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", Date='" + getDate() + "'" +
            ", salary='" + getSalary() + "'" +
            ", percent='" + getPercent() + "'" +
            "}";
    }


}