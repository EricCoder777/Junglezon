package com.daclink.junglezon.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

//import com.daclink.junglezon.ItemLog;
import com.daclink.junglezon.UserLog;

@Database(entities = {UserLog.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DB_NAME = "JUNGLEZON_DATABASE";
    public static final String USER_TABLE = "USER_TABLE";
    //public static final String ITEM_TABLE = "com.daclink.junglezon.ITEM_TABLE";

    public abstract JungleDAO getJungleDAO();
}
