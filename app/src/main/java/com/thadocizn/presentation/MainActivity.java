package com.thadocizn.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         // todo #1 create xml layouts
        RecyclerView recyclerView = findViewById(R.id.recycleViewer);
        // todo #2 create pojo
        ArrayList<State> states = getStates();
        // todo #4 set recycle viewer layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // todo #5 create RecycleView adapter
        RecycleViewAdapter adapter = new RecycleViewAdapter(states);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<State> getStates() {
        // todo #3 create state objects
        ArrayList<State> states = new ArrayList<>();

        states.add(new State(getString(R.string.arkansas),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        states.add(new State(
                getString(R.string.wisconsin),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        states.add(new State(
                getString(R.string.indiana),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        states.add(new State(
                getString(R.string.texas),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        states.add(new State(
                getString(R.string.california),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        states.add(new State(
                getString(R.string.florida),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        states.add(new State(
                getString(R.string.hawaii),
                getString(R.string.capitol),
                100000,
                "Zoo"));
        return states;
    }
}
