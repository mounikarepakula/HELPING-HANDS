package com.example.helpinghands;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomDatabase;
@Database(entities={StudentData.class},version=1,exportSchema = false)
public abstract class StudentRoomDB extends RoomDatabase {
    public abstract  StudentDao studentDao();


}

