package com.daclink.junglezon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daclink.junglezon.db.AppDatabase;
import com.daclink.junglezon.db.JungleDAO;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView mMainDisplay;
    EditText mUsername;
    EditText mPassword;

    Button mLoginButton;

    Button mCreateAccountButton;

    JungleDAO mJungleDao;

    List<UserLog> mUserLogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                mJungleDao = Room.databaseBuilder(this, AppDatabase.class, AppDatabase.DB_NAME)
                .allowMainThreadQueries()
                .build()
                .getJungleDAO();


        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);




    }


}