package com.thadocizn.presentation;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    ArrayList<State> states;

    public RecycleViewAdapter(ArrayList<State> states) {
        this.states = states;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.ViewHolder viewHolder, int i) {
        State current = states.get(i);
        viewHolder.state.setText(current.getState());
        viewHolder.stateCapitol.setText(current.getStateCapitol());
        //might use a string for population so I wont have to convert it to double
        viewHolder.population.setText(String.valueOf(current.getStatePopulation()));
        viewHolder.attraction.setText(current.getStateAttraction());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView state;
        private TextView stateCapitol;
        private TextView population;
        private TextView attraction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            state = itemView.findViewById(R.id.textViewState);
            stateCapitol = itemView.findViewById(R.id.textViewStateCapitol);
            population = itemView.findViewById(R.id.textViewPopulation);
            attraction = itemView.findViewById(R.id.textViewAttraction);
        }
    }
}
