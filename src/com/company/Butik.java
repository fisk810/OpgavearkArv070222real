package com.company;

public class Butik extends Ejendom{
    protected double butiksAreal;
    public Butik(double beboedeAreal, double butiksAreal, double pris) {
        super(beboedeAreal, pris);
        this.butiksAreal = butiksAreal;
    }

    public double udregnAreal(){
        return beboedeAreal + butiksAreal;
    }

    public double prisPerKvm(double pris, double areal){
        return pris/areal;
    }
}
