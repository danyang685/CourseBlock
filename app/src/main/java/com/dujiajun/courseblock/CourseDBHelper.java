package com.dujiajun.courseblock;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class CourseDBHelper extends SQLiteOpenHelper {

    private static final String CREATE_COURSE_TABLE = "CREATE TABLE course(" +
            "id integer primary key autoincrement," +
            "name text not null," +
            "room text," +
            "teacher text," +
            "start integer," +
            "step integer," +
            "day integer," +
            "weeklist text)";
    private static final String DB_NAME = "course.db";
    private Context mContext;

    public CourseDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_COURSE_TABLE);
        Toast.makeText(mContext, "CREATED DATABASE", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
