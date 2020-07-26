package com.example.healthshabalkova;

public class Vitals {
    double weigh;
    int steps;

    public Vitals(double weigh, int steps) {
        this.weigh = weigh;
        this.steps = steps;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}
