package com.company;

public class Villa extends Ejendom{
    private int rum;

    public Villa(int rum, double beboedeAreal, double pris) {
        super(beboedeAreal, pris);
        this.rum = rum;
    }

    public double prisPerKvm(double pris, double areal){
        return pris/areal;
    }
}
