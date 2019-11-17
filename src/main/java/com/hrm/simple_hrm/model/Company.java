package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * Company
 */
public class Company {

    @Id
    private String id;
    private String companyName;
    private String  aboutComapny;

    public Company() {
    }

    public Company(String id, String companyName, String aboutComapny, String webSite, String address, String phone, String taxNumber, String tinNumber, String email) {
        this.id = id;
        this.companyName = companyName;
        this.aboutComapny = aboutComapny;
        this.webSite = webSite;
        this.address = address;
        this.phone = phone;
        this.taxNumber = taxNumber;
        this.tinNumber = tinNumber;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAboutComapny() {
        return this.aboutComapny;
    }

    public void setAboutComapny(String aboutComapny) {
        this.aboutComapny = aboutComapny;
    }

    public String getWebSite() {
        return this.webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getTinNumber() {
        return this.tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Company id(String id) {
        this.id = id;
        return this;
    }

    public Company companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Company aboutComapny(String aboutComapny) {
        this.aboutComapny = aboutComapny;
        return this;
    }

    public Company webSite(String webSite) {
        this.webSite = webSite;
        return this;
    }

    public Company address(String address) {
        this.address = address;
        return this;
    }

    public Company phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Company taxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    public Company tinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
        return this;
    }

    public Company email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Company)) {
            return false;
        }
        Company company = (Company) o;
        return Objects.equals(id, company.id) && Objects.equals(companyName, company.companyName) && Objects.equals(aboutComapny, company.aboutComapny) && Objects.equals(webSite, company.webSite) && Objects.equals(address, company.address) && Objects.equals(phone, company.phone) && Objects.equals(taxNumber, company.taxNumber) && Objects.equals(tinNumber, company.tinNumber) && Objects.equals(email, company.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, companyName, aboutComapny, webSite, address, phone, taxNumber, tinNumber, email);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", companyName='" + getCompanyName() + "'" +
            ", aboutComapny='" + getAboutComapny() + 
            "'" +
            ", webSite='" + getWebSite() + "'" +
            ", address='" + getAddress() + "'" +
            ", phone='" + getPhone() + "'" +
            ", taxNumber='" + getTaxNumber() + "'" +
            ", tinNumber='" + getTinNumber() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }
    private String webSite;
    private String address;
    private String phone;
    private String taxNumber;
    private String tinNumber; 
    private String email;


}