package com.example.olgac.tutors_project;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by olgac on 3/28/2018.
 */
@Entity
public class Skills {
    @PrimaryKey
    @NonNull
    private int IDSkill;
    private String nameSkill;
    private int IDSubject;

    public Skills(@NonNull int IDSkill, String nameSkill, int IDSubject) {
        this.IDSkill = IDSkill;
        this.nameSkill = nameSkill;
        this.IDSubject = IDSubject;
    }

    @NonNull
    public int getIDSkill() {
        return IDSkill;
    }

    public void setIDSkill(@NonNull int IDSkill) {
        this.IDSkill = IDSkill;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public int getIDSubject() {
        return IDSubject;
    }

    public void setIDSubject(int IDSubject) {
        this.IDSubject = IDSubject;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "IDSkill=" + IDSkill +
                ", nameSkill='" + nameSkill + '\'' +
                ", IDSubject=" + IDSubject +
                '}';
    }
}
