package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Departement")
public class Departement {

  @Id
  private String id;
  private String deptCode;
  private String deptName;
  private String parentCode;
  private String crtDt;
  private String lmDt;
    
    public Departement() {
    }

  

    public Departement(String id, String deptCode, String deptName, String parentCode, String crtDt, String lmDt) {
        this.id = id;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.parentCode = parentCode;
        this.crtDt = crtDt;
        this.lmDt = lmDt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptCode() {
        return this.deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
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

    public Departement id(String id) {
        this.id = id;
        return this;
    }

    public Departement deptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    public Departement deptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public Departement parentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }

    public Departement crtDt(String crtDt) {
        this.crtDt = crtDt;
        return this;
    }

    public Departement lmDt(String lmDt) {
        this.lmDt = lmDt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Departement)) {
            return false;
        }
        Departement departement = (Departement) o;
        return Objects.equals(id, departement.id) && Objects.equals(deptCode, departement.deptCode) && Objects.equals(deptName, departement.deptName) && Objects.equals(parentCode, departement.parentCode) && Objects.equals(crtDt, departement.crtDt) && Objects.equals(lmDt, departement.lmDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deptCode, deptName, parentCode, crtDt, lmDt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", deptCode='" + getDeptCode() + "'" +
            ", deptName='" + getDeptName() + "'" +
            ", parentCode='" + getParentCode() + "'" +
            ", crtDt='" + getCrtDt() + "'" +
            ", lmDt='" + getLmDt() + "'" +
            "}";
    }

}
    
