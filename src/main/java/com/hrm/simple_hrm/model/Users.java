package com.hrm.simple_hrm.model;

import java.util.Set;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Users
 */
@Document("Users")
public class Users {

    @Id
    private String id;
    private String userName;
    private String fullName;
    private String email;
    private String password;
    private boolean isLoggedIn;
    private boolean isLocked;
    private Set<Role> role;




    public Users() {
    }

    public Users(String id, String userName, String fullName, String email, String password, boolean isLoggedIn, boolean isLocked, Set<Role> role) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
        this.isLocked = isLocked;
        this.role = role;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsLoggedIn() {
        return this.isLoggedIn;
    }

    public boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public boolean isIsLocked() {
        return this.isLocked;
    }

    public boolean getIsLocked() {
        return this.isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Set<Role> getRole() {
        return this.role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public Users id(String id) {
        this.id = id;
        return this;
    }

    public Users userName(String userName) {
        this.userName = userName;
        return this;
    }

    public Users fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Users email(String email) {
        this.email = email;
        return this;
    }

    public Users password(String password) {
        this.password = password;
        return this;
    }

    public Users isLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
        return this;
    }

    public Users isLocked(boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    public Users role(Set<Role> role) {
        this.role = role;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Users)) {
            return false;
        }
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(userName, users.userName) && Objects.equals(fullName, users.fullName) && Objects.equals(email, users.email) && Objects.equals(password, users.password) && isLoggedIn == users.isLoggedIn && isLocked == users.isLocked && Objects.equals(role, users.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, fullName, email, password, isLoggedIn, isLocked, role);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", userName='" + getUserName() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", isLoggedIn='" + isIsLoggedIn() + "'" +
            ", isLocked='" + isIsLocked() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }

	public void setEnabled(boolean b) {
	}
   


}
