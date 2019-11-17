package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * LeaveType
 */
@Document("LeaveType")
public class LeaveType {
    @Id
    private String id;
    private String leaveName;
    private String leaveDesc;
    private int maxDate;
    private int minDate;
    private String crtDt;
    private String lmDt;

    public LeaveType() {
    }

    public LeaveType(String id, String leaveName, String leaveDesc, int maxDate, int minDate, String crtDt, String lmDt) {
        this.id = id;
        this.leaveName = leaveName;
        this.leaveDesc = leaveDesc;
        this.maxDate = maxDate;
        this.minDate = minDate;
        this.crtDt = crtDt;
        this.lmDt = lmDt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLeaveName() {
        return this.leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getLeaveDesc() {
        return this.leaveDesc;
    }

    public void setLeaveDesc(String leaveDesc) {
        this.leaveDesc = leaveDesc;
    }

    public int getMaxDate() {
        return this.maxDate;
    }

    public void setMaxDate(int maxDate) {
        this.maxDate = maxDate;
    }

    public int getMinDate() {
        return this.minDate;
    }

    public void setMinDate(int minDate) {
        this.minDate = minDate;
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

    public LeaveType id(String id) {
        this.id = id;
        return this;
    }

    public LeaveType leaveName(String leaveName) {
        this.leaveName = leaveName;
        return this;
    }

    public LeaveType leaveDesc(String leaveDesc) {
        this.leaveDesc = leaveDesc;
        return this;
    }

    public LeaveType maxDate(int maxDate) {
        this.maxDate = maxDate;
        return this;
    }

    public LeaveType minDate(int minDate) {
        this.minDate = minDate;
        return this;
    }

    public LeaveType crtDt(String crtDt) {
        this.crtDt = crtDt;
        return this;
    }

    public LeaveType lmDt(String lmDt) {
        this.lmDt = lmDt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LeaveType)) {
            return false;
        }
        LeaveType leaveType = (LeaveType) o;
        return Objects.equals(id, leaveType.id) && Objects.equals(leaveName, leaveType.leaveName) && Objects.equals(leaveDesc, leaveType.leaveDesc) && maxDate == leaveType.maxDate && minDate == leaveType.minDate && Objects.equals(crtDt, leaveType.crtDt) && Objects.equals(lmDt, leaveType.lmDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, leaveName, leaveDesc, maxDate, minDate, crtDt, lmDt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", leaveName='" + getLeaveName() + "'" +
            ", leaveDesc='" + getLeaveDesc() + "'" +
            ", maxDate='" + getMaxDate() + "'" +
            ", minDate='" + getMinDate() + "'" +
            ", crtDt='" + getCrtDt() + "'" +
            ", lmDt='" + getLmDt() + "'" +
            "}";
    }

}