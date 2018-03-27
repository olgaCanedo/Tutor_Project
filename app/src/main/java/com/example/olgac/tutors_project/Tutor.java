package com.example.olgac.tutors_project;

/**
 * Created by olgac on 3/25/2018.
 */

public class Tutor {
    private long tutorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String campus;
    private String subject;
    private String skill;


    public Tutor(long tutorId, String firstname, String lastname,
                 String email, String phone, String campus, String subject, String skill){
        this.tutorId = tutorId;
        this.firstName = firstname;
        this.lastName = lastname;
        this.email = email;
        this.phone = phone;
        this.campus = campus;
        this.subject = subject;
        this.skill = skill;
    }

    public Tutor(){

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

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
                ", campus='" + campus + '\'' +
                ", subject='" + subject + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
