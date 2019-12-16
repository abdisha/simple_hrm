package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Role
 */
@Document("Role")
public class Role {

    @Id
    private String id;
    private String roleName;
    private String roleDesc;
    private String crtBy;
    private String crtDt;

    public Role() {
    }

    public Role(String id, String roleName, String roleDesc, String crtBy, String crtDt) {
        this.id = id;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.crtBy = crtBy;
        this.crtDt = crtDt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return this.roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getCrtBy() {
        return this.crtBy;
    }

    public void setCrtBy(String crtBy) {
        this.crtBy = crtBy;
    }

    public String getCrtDt() {
        return this.crtDt;
    }

    public void setCrtDt(String crtDt) {
        this.crtDt = crtDt;
    }

    public Role id(String id) {
        this.id = id;
        return this;
    }

    public Role roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public Role roleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
        return this;
    }

    public Role crtBy(String crtBy) {
        this.crtBy = crtBy;
        return this;
    }

    public Role crtDt(String crtDt) {
        this.crtDt = crtDt;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Role)) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(roleName, role.roleName) && Objects.equals(roleDesc, role.roleDesc) && Objects.equals(crtBy, role.crtBy) && Objects.equals(crtDt, role.crtDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName, roleDesc, crtBy, crtDt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", roleName='" + getRoleName() + "'" +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", crtBy='" + getCrtBy() + "'" +
            ", crtDt='" + getCrtDt() + "'" +
            "}";
    }

}