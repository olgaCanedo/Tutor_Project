package com.example.olgac.tutors_project;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by olgac on 3/25/2018.
 */
@Entity
public class Tutor {
    @PrimaryKey
    @NonNull
    private long tutorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int campusID;
    private int subjectID;
    private String skill;


    public Tutor(long tutorId, String firstname, String lastname,
                 String email, String phone, int campus, int subject, String skill){
        this.tutorId = tutorId;
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.phone = phone;
        this.campusID = campus;
        this.subjectID = subject;
        this.skill = skill;
    }

    public Tutor(){

    }

    public void setCampusID(int campusID) {
        this.campusID = campusID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getCampusID() {
        return campusID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public long getTutorId() {
        return tutorId;
    }

    public void setTutorId(long tutorId) {
        this.tutorId = tutorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCampus() {
        return campusID;
    }

    public void setCampus(int campus) {
        this.campusID = campus;
    }

    public int getSubject() {
        return subjectID;
    }

    public void setSubject(int subject) {
        this.subjectID = subject;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutorId=" + tutorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", campus='" + campusID + '\'' +
                ", subject='" + subjectID + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
