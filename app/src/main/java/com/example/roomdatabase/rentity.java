package com.example.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "employee info")
public class rentity {
    @ColumnInfo(name="employee_name")
    public String name;

    @ColumnInfo(name="employee_address")
    public String address;
     @PrimaryKey
     @NonNull
    public int E_ID;

    public rentity(String name, String address, int E_ID) {
        this.name = name;
        this.address = address;
        this.E_ID=E_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getE_ID() {
        return E_ID;
    }

    public void setE_ID(int e_ID) {
        E_ID = e_ID;
    }


}
