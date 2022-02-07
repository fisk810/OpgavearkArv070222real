package com.company;

public class Etage extends Butik {
    private int etage;
    public Etage(double beboedeAreal, double butiksAreal, double pris, int etage) {
        super(beboedeAreal, butiksAreal, pris);
        this.etage = etage;
    }

}
