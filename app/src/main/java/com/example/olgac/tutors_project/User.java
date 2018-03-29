package com.example.olgac.tutors_project;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by olgac on 3/28/2018.
 */
@Entity (tableName = "user")
public class User {
    @PrimaryKey
    @NonNull
    private int IDUser;
    private String nameU;
    private String password;

    public User(@NonNull int IDUser, String nameU, String password) {
        this.IDUser = IDUser;
        this.nameU = nameU;
        this.password = password;
    }

    @NonNull
    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(@NonNull int IDUser) {
        this.IDUser = IDUser;
    }

    public String getNameU() {
        return nameU;
    }

    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "IDUser=" + IDUser +
                ", nameU='" + nameU + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
