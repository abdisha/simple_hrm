package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * LeaveTaken
 */
@Document("LeaveTaken")
public class LeaveTaken {

    @Id
     private String id;
     private String numberOfDate;
     private String fromDate;
     private LeaveType leaveType;
     private String toDate;
     private String crtDt;
     private String lmDt;


    public LeaveTaken() {
    }

    public LeaveTaken(String id, String numberOfDate, String fromDate, LeaveType leaveType, String toDate, String crtDt, String lmDt) {
        this.id = id;
        this.numberOfDate = numberOfDate;
        this.fromDate = fromDate;
        this.leaveType = leaveType;
        this.toDate = toDate;
        this.crtDt = crtDt;
        this.lmDt = lmDt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberOfDate() {
        return this.numberOfDate;
    }

    public void setNumberOfDate(String numberOfDate) {
        this.numberOfDate = numberOfDate;
    }

    public String getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public LeaveType getLeaveType() {
        return this.leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public String getToDate() {
        return this.toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
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

    public LeaveTaken id(String id) {
        this.id = id;
        return this;
    }

    public LeaveTaken numberOfDate(String numberOfDate) {
        this.numberOfDate = numberOfDate;
        return this;
    }

    public LeaveTaken fromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public LeaveTaken leaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
        return this;
    }

    public LeaveTaken toDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    public LeaveTaken crtDt(String crtDt) {
        this.crtDt = crtDt;
        return this;
    }

    public LeaveTaken lmDt(String lmDt) {
        this.lmDt = lmDt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LeaveTaken)) {
            return false;
        }
        LeaveTaken leaveTaken = (LeaveTaken) o;
        return Objects.equals(id, leaveTaken.id) && Objects.equals(numberOfDate, leaveTaken.numberOfDate) && Objects.equals(fromDate, leaveTaken.fromDate) && Objects.equals(leaveType, leaveTaken.leaveType) && Objects.equals(toDate, leaveTaken.toDate) && Objects.equals(crtDt, leaveTaken.crtDt) && Objects.equals(lmDt, leaveTaken.lmDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberOfDate, fromDate, leaveType, toDate, crtDt, lmDt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", numberOfDate='" + getNumberOfDate() + "'" +
            ", fromDate='" + getFromDate() + "'" +
            ", leaveType='" + getLeaveType() + "'" +
            ", toDate='" + getToDate() + "'" +
            ", crtDt='" + getCrtDt() + "'" +
            ", lmDt='" + getLmDt() + "'" +
            "}";
    }

}