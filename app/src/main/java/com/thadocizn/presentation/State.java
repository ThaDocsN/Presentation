package com.thadocizn.presentation;

public class State {

    private String state;
    private String stateCapitol;
    private double statePopulation;
    private String stateAttraction;

    public State(String state,
                 String stateCapitol,
                 double statePopulation,
                 String stateAttraction) {
        this.state = state;
        this.stateCapitol = stateCapitol;
        this.statePopulation = statePopulation;
        this.stateAttraction = stateAttraction;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateCapitol() {
        return stateCapitol;
    }

    public void setStateCapitol(String stateCapitol) {
        this.stateCapitol = stateCapitol;
    }

    public double getStatePopulation() {
        return statePopulation;
    }

    public void setStatePopulation(double statePopulation) {
        this.statePopulation = statePopulation;
    }

    public String getStateAttraction() {
        return stateAttraction;
    }

    public void setStateAttraction(String stateAttraction) {
        this.stateAttraction = stateAttraction;
    }
}
