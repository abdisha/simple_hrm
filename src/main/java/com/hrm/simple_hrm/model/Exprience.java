package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * Exprience
 */
public class Exprience {

    @Id
    private String id;
    private String jobPosition;
    private String companyName;
    private String fromDate;
    private String toDate;
    private String rangeTime;

    public Exprience() {
    }

    public Exprience(String id, String jobPosition, String companyName, String fromDate, String toDate, String rangeTime) {
        this.id = id;
        this.jobPosition = jobPosition;
        this.companyName = companyName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.rangeTime = rangeTime;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobPosition() {
        return this.jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getRangeTime() {
        return this.rangeTime;
    }

    public void setRangeTime(String rangeTime) {
        this.rangeTime = rangeTime;
    }

    public Exprience id(String id) {
        this.id = id;
        return this;
    }

    public Exprience jobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
        return this;
    }

    public Exprience companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Exprience fromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public Exprience toDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    public Exprience rangeTime(String rangeTime) {
        this.rangeTime = rangeTime;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Exprience)) {
            return false;
        }
        Exprience exprience = (Exprience) o;
        return Objects.equals(id, exprience.id) && Objects.equals(jobPosition, exprience.jobPosition) && Objects.equals(companyName, exprience.companyName) && Objects.equals(fromDate, exprience.fromDate) && Objects.equals(toDate, exprience.toDate) && Objects.equals(rangeTime, exprience.rangeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobPosition, companyName, fromDate, toDate, rangeTime);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jobPosition='" + getJobPosition() + "'" +
            ", companyName='" + getCompanyName() + "'" +
            ", fromDate='" + getFromDate() + "'" +
            ", toDate='" + getToDate() + "'" +
            ", rangeTime='" + getRangeTime() + "'" +
            "}";
    }

}