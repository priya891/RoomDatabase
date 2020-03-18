package com.example.roomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = rentity.class,version = 2,exportSchema = false)
public abstract class rdatabase extends RoomDatabase {
    public abstract rDAO rDAO();
}
