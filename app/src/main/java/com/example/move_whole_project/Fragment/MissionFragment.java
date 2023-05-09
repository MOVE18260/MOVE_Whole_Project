package com.example.move_whole_project.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.move_whole_project.AppTest;
import com.example.move_whole_project.R;


public class MissionFragment extends Fragment {

    int check;
    TextView tv_missioncheck;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mission, container, false);

        tv_missioncheck = (TextView)view.findViewById(R.id.tv_missioncheck);

        check = AppTest.getCnt();

        tv_missioncheck.setText(String.valueOf(check));
        // Inflate the layout for this fragment

        return view;


    }
}