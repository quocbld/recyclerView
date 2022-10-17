package com.example.rcview_lebaquoc;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvComputer;
    List<Mode> computerList = new ArrayList<Mode>();
    ComputerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvComputer = (RecyclerView) findViewById(R.id.rvComputer);

        setTeamData();
        adapter = new ComputerAdapter(computerList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        rvComputer.setLayoutManager(manager);
        rvComputer.setAdapter(adapter);
    }

    private void setTeamData() {
        Mode may = new Mode("ASUS TUF GAMING F15", 19000000, R.drawable.asus);
        computerList.add(may);
        may = new Mode("ACER NITRO 5", 20000000, R.drawable.acer);
        computerList.add(may);
        may = new Mode("PC GAMING", 20000000, R.drawable.gaming);
        computerList.add(may);
        may = new Mode("IMAC", 34000000, R.drawable.imac);
        computerList.add(may);
    }
}