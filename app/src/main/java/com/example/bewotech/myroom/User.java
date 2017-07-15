package com.example.bewotech.myroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Bewotech on 15-07-2017.
 */
@Entity
public class User {
    @PrimaryKey
    private int id;
    @ColumnInfo(name="first_name")
    private String firstname;
    @ColumnInfo (name="last_name")
    private String lastname;

}
