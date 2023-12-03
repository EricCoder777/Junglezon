package com.daclink.junglezon.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

//import com.daclink.junglezon.ItemLog;
import com.daclink.junglezon.UserLog;

import java.util.List;

@Dao
public interface JungleDAO {

    @Insert
    void insert(UserLog... UserLogs);

    @Update
    void update(UserLog... UserLogs);

    @Delete
    void delete(UserLog UserLogs);

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE)
    List<UserLog> getAllUserLogs();

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE + " WHERE mUserID = :userID")
    UserLog getUserLogsByID(int userID);
}
