package com.example.olgac.tutors_project;

/**
 * Created by olgac on 3/28/2018.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Campus {
    @PrimaryKey
    @NonNull
    private int IDCampus;
    private String nameC;

    public Campus(@NonNull int IDCampus, String nameC) {
        this.IDCampus = IDCampus;
        this.nameC = nameC;
    }

    @NonNull
    public int getIDCampus() {
        return IDCampus;
    }

    public void setIDCampus(@NonNull int IDCampus) {
        this.IDCampus = IDCampus;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    @Override
    public String toString() {
        return "Campus{" +
                "IDCampus=" + IDCampus +
                ", nameC='" + nameC + '\'' +
                '}';
    }
}
