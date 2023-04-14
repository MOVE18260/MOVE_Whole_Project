package com.example.move_whole_project.Register_Login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.move_whole_project.R;

public class MainActivity extends AppCompatActivity {

    private TextView tv_name, tv_nickname, tv_id, tv_pass, tv_gender,tv_region,tv_year, tv_month;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name = findViewById(R.id.tv_name);
        tv_nickname = findViewById(R.id.tv_nickname);
        tv_id = findViewById(R.id.tv_id);
        tv_pass = findViewById(R.id.tv_pass);
        tv_gender = findViewById(R.id.tv_gender);
        tv_region = findViewById(R.id.tv_region);
        tv_year= findViewById(R.id.tv_year);
//        tv_month = findViewById(R.id.tv_month);

        Intent intent = getIntent();

        String userName = intent.getStringExtra("userName");
        String userNickname = intent.getStringExtra("userNickname");
        String userID = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");
        String userGender = intent.getStringExtra("userGender");
        String userRegion = intent.getStringExtra("userRegion");
        int userYear = intent.getIntExtra("userYear" , 0);
//        int userMonth = intent.getIntExtra("userMonth", 0);

        tv_name.setText(userName);
        tv_nickname.setText(userNickname);
        tv_id.setText(userID);
        tv_pass.setText(userPass);
        tv_gender.setText(userGender);
        tv_region.setText(userRegion);
        tv_year.setText(String.valueOf(userYear));
//        tv_month.setText(String.valueOf(userMonth));



    }
}