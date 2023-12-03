//package com.daclink.junglezon;
//
//import androidx.room.Entity;
//import androidx.room.PrimaryKey;
//
//import com.daclink.junglezon.db.AppDatabase;
//
//@Entity(tableName = AppDatabase.ITEM_TABLE)
//public class ItemLog {
//
//    @PrimaryKey(autoGenerate = true)
//    private int mItemID;
//    private String mItemName;
//    private int mQuantity;
//    private double mPrice;
//
//    public ItemLog(String mItemName, int mQuantity, double mPrice) {
//        this.mItemName = mItemName;
//        this.mQuantity = mQuantity;
//        this.mPrice = mPrice;
//    }
//
//    public int getmItemID() {
//        return mItemID;
//    }
//
//    public void setmItemID(int mItemID) {
//        this.mItemID = mItemID;
//    }
//
//    public String getmItemName() {
//        return mItemName;
//    }
//
//    public void setmItemName(String mItemName) {
//        this.mItemName = mItemName;
//    }
//
//    public int getmQuantity() {
//        return mQuantity;
//    }
//
//    public void setmQuantity(int mQuantity) {
//        this.mQuantity = mQuantity;
//    }
//
//    public double getmPrice() {
//        return mPrice;
//    }
//
//    public void setmPrice(double mPrice) {
//        this.mPrice = mPrice;
//    }
//}
