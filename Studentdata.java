package com.example.helpinghands;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class StudentData {
    @NonNull
    @PrimaryKey
    String stdId;

    String stdName;

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public String getStdName() {
        return stdId;
    }

    public void setStdName(String stdName) {
        this.stdId = stdId;
    }
}

