package com.daclink.junglezon;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.daclink.junglezon.db.AppDatabase;

@Entity(tableName = AppDatabase.USER_TABLE)
public class UserLog {
    @PrimaryKey(autoGenerate = true)
    private int mUserID;
    private String mUserName;
    private String mUserPassword;
    private Boolean isAdmin;

    public UserLog(String mUserName, String mUserPassword, Boolean isAdmin) {
        this.mUserName = mUserName;
        this.mUserPassword = mUserPassword;
        this.isAdmin = isAdmin;
    }

    public int getUserID() {
        return mUserID;
    }

    public void setUserID(int mUserID) {
        this.mUserID = mUserID;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getUserPassword() {
        return mUserPassword;
    }

    public void setUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
