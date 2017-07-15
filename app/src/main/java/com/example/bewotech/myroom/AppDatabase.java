package com.example.bewotech.myroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Bewotech on 15-07-2017.
 */

public class AppDatabase {
@Database(entities = {User.class},version = 1)
    public abstract class AppDatbase extends RoomDatabase{
    public abstract  UserDao userDao();
}

    AppDatabase db = Room.databaseBuilder(getApplicationContext(),
            AppDatabase.class, "database-name").build();
}
