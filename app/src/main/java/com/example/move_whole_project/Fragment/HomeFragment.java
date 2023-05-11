package com.example.move_whole_project.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.move_whole_project.AppTest;
import com.example.move_whole_project.R;

// 현재 시간을 확인하는 핸들러 및 함수


public class HomeFragment extends Fragment {

    Button btn_cnt;
    private TextView tv_check, tv_time;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btn_cnt = (Button)view.findViewById(R.id.btn_cnt);
        tv_check = (TextView) view.findViewById(R.id.tv_check);
        tv_time = (TextView)view.findViewById(R.id.tv_time);


        btn_cnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppTest.count();
                tv_check.setText(String.valueOf(AppTest.getCnt()));
            }
        });


        // Inflate the layout for this fragment
        return view;

    }

}