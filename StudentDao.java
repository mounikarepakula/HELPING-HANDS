package com.example.helpinghands;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    public void insertData(StudentData studentsData);
    @Query("select * from StudentData")
    public List<StudentData> readDataAll();

}

