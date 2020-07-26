package com.example.healthshabalkova;

import java.util.Objects;

public class BPdata {
    protected int lowBP;
    protected int hightBP;
    protected int pulse;
    protected boolean tachycardia;
    protected String data;

    public BPdata(int lowBP, int hightBP, int pulse, boolean tachycardia, String data) {
        this.lowBP = lowBP;
        this.hightBP = hightBP;
        this.pulse = pulse;
        this.tachycardia = tachycardia;
        this.data = data;
    }

    public int getLowBP() {
        return lowBP;
    }

    public void setLowBP(int lowBP) {
        this.lowBP = lowBP;
    }

    public int getHightBP() {
        return hightBP;
    }

    public void setHightBP(int hightBP) {
        this.hightBP = hightBP;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public boolean isTachycardia() {
        return tachycardia;
    }

    public void setTachycardia(boolean tachycardia) {
        this.tachycardia = tachycardia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BPdata)) return false;
        BPdata bPdata = (BPdata) o;
        return data.equals(bPdata.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
