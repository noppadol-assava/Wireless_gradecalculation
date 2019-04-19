package com.example.wireless_gradecalculation.studentgradedatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.support.annotation.NonNull;

@Entity(tableName = "studentgrade",
        primaryKeys = {"UID", "CID"})
public class StudentGrade {
    @NonNull
    public String UID;
    @NonNull
    public String CID;

    @ColumnInfo(name = "Grade")
    public String grade;

    public StudentGrade(String UID, String CID, String grade) {
        this.UID = UID;
        this.CID = CID;
        this.grade = grade;
    }
}


