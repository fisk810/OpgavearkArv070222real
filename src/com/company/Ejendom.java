package com.company;

public abstract class Ejendom {
    protected double beboedeAreal;
    protected double pris;

    protected Ejendom(double beboedeAreal, double pris) {
        this.beboedeAreal = beboedeAreal;
        this.pris = pris;
    }

    public abstract double prisPerKvm(double pris, double areal);
}
