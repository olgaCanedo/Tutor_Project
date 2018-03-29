package com.example.olgac.tutors_project;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by olgac on 3/28/2018.
 */
@Entity
public class Subjects {
    @PrimaryKey
    @NonNull
    private int IDSubject;
    private  String nameS;

    public Subjects(@NonNull int IDSubject, String nameS) {
        this.IDSubject = IDSubject;
        this.nameS = nameS;
    }

    @NonNull
    public int getIDSubject() {
        return IDSubject;
    }

    public void setIDSubject(@NonNull int IDSubject) {
        this.IDSubject = IDSubject;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "IDSubject=" + IDSubject +
                ", nameS='" + nameS + '\'' +
                '}';
    }
}
