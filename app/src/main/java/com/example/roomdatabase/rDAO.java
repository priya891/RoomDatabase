package com.example.roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface rDAO {
    @Insert
    Long InsertTask(rentity rentity);

}
