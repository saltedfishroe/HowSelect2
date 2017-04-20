package com.jj.howselect2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.jj.greendao.DaoMaster;

/**
 * Created by Administrator on 2017/4/19 0019.
 */

public class MyOpenHelper extends DaoMaster.OpenHelper {
    public MyOpenHelper(Context context, String name) {
        super(context, name);
    }

    public MyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
