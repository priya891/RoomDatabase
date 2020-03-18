package com.example.roomdatabase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.room.Room;

public class repository {
    private String DB_NAME="employee_db";
    private rdatabase rdatabase;
    Context context;
    public repository(Context context) {
        this.context = context;
        rdatabase= Room.databaseBuilder(context,rdatabase.class,DB_NAME).build();
        Toast.makeText(context,"kuch bhi",Toast.LENGTH_SHORT).show();
    }

    public void InsertTask(final rentity rentity) {
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... voids) {
                rdatabase.rDAO().InsertTask(rentity);
                return null;
            }

                   }.execute();
    }




}

