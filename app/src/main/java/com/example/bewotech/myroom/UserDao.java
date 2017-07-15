package com.example.bewotech.myroom;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Bewotech on 15-07-2017.
 */

public interface UserDao {

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND "+"last_name LIKE:last LIMIT 1")
    User findByName(String first,String last);

    @Insert
    void insertAll(User...users);

    @Delete
    void delete(User user);

}
