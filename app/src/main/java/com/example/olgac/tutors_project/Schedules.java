package com.example.olgac.tutors_project;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by olgac on 3/28/2018.
 */
@Entity
public class Schedules {
    @PrimaryKey
    @NonNull
    private int IDSchedule;
    private int IDTutor;
    private String day;
    private int HourStart;
    private int HourEnd;
    private int minStart;
    private int minEnd;
    private String roomNumber;

    public Schedules() {
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @NonNull
    public int getIDSchedule() {
        return IDSchedule;
    }

    public void setIDSchedule(@NonNull int IDSchedule) {
        this.IDSchedule = IDSchedule;
    }

    public int getIDTutor() {
        return IDTutor;
    }

    public void setIDTutor(int IDTutor) {
        this.IDTutor = IDTutor;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getHourStart() {
        return HourStart;
    }

    public void setHourStart(int hourStart) {
        HourStart = hourStart;
    }

    public int getHourEnd() {
        return HourEnd;
    }

    public void setHourEnd(int hourEnd) {
        HourEnd = hourEnd;
    }

    public int getMinStart() {
        return minStart;
    }

    public void setMinStart(int minStart) {
        this.minStart = minStart;
    }

    public int getMinEnd() {
        return minEnd;
    }

    public void setMinEnd(int minEnd) {
        this.minEnd = minEnd;
    }

    @Override
    public String toString() {
        return "Schedules{" +
                "IDSchedule=" + IDSchedule +
                ", IDTutor=" + IDTutor +
                ", day='" + day + '\'' +
                ", HourStart=" + HourStart +
                ", HourEnd=" + HourEnd +
                ", minStart=" + minStart +
                ", minEnd=" + minEnd +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
