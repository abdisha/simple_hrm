package com.hrm.simple_hrm.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * Education
 */
public class Education {

    @Id
    private String id;
    private String  eduactionLevel;
    private String courseOfeducation;
    private String graduatedYear;
    private double _GBA;
    private String  instituation;

    public Education() {
    }

    public Education(String id, String eduactionLevel, String courseOfeducation, String graduatedYear, double _GBA, String instituation) {
        this.id = id;
        this.eduactionLevel = eduactionLevel;
        this.courseOfeducation = courseOfeducation;
        this.graduatedYear = graduatedYear;
        this._GBA = _GBA;
        this.instituation = instituation;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEduactionLevel() {
        return this.eduactionLevel;
    }

    public void setEduactionLevel(String eduactionLevel) {
        this.eduactionLevel = eduactionLevel;
    }

    public String getCourseOfeducation() {
        return this.courseOfeducation;
    }

    public void setCourseOfeducation(String courseOfeducation) {
        this.courseOfeducation = courseOfeducation;
    }

    public String getGraduatedYear() {
        return this.graduatedYear;
    }

    public void setGraduatedYear(String graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public double get_GBA() {
        return this._GBA;
    }

    public void set_GBA(double _GBA) {
        this._GBA = _GBA;
    }

    public String getInstituation() {
        return this.instituation;
    }

    public void setInstituation(String instituation) {
        this.instituation = instituation;
    }

    public Education id(String id) {
        this.id = id;
        return this;
    }

    public Education eduactionLevel(String eduactionLevel) {
        this.eduactionLevel = eduactionLevel;
        return this;
    }

    public Education courseOfeducation(String courseOfeducation) {
        this.courseOfeducation = courseOfeducation;
        return this;
    }

    public Education graduatedYear(String graduatedYear) {
        this.graduatedYear = graduatedYear;
        return this;
    }

    public Education _GBA(double _GBA) {
        this._GBA = _GBA;
        return this;
    }

    public Education instituation(String instituation) {
        this.instituation = instituation;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Education)) {
            return false;
        }
        Education education = (Education) o;
        return Objects.equals(id, education.id) && Objects.equals(eduactionLevel, education.eduactionLevel) && Objects.equals(courseOfeducation, education.courseOfeducation) && Objects.equals(graduatedYear, education.graduatedYear) && _GBA == education._GBA && Objects.equals(instituation, education.instituation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eduactionLevel, courseOfeducation, graduatedYear, _GBA, instituation);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", eduactionLevel='" + getEduactionLevel() + "'" +
            ", courseOfeducation='" + getCourseOfeducation() + "'" +
            ", graduatedYear='" + getGraduatedYear() + "'" +
            ", _GBA='" + get_GBA() + "'" +
            ", instituation='" + getInstituation() + "'" +
            "}";
    }

}