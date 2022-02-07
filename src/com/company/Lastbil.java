package com.company;

public class Lastbil extends Koeretoej{
    private double hesteKraeft;
    private double lastKapacitet;

    public Lastbil(double vaegtafgift, String registreringsnummer, double hesteKraeft, double lastKapacitet) {
        super(vaegtafgift, registreringsnummer);
        this.hesteKraeft = hesteKraeft;
        this.lastKapacitet = lastKapacitet;
    }

    @Override
    public String toString() {
        return "Lastbil{" +
                "vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                ", hesteKraeft=" + hesteKraeft +
                ", lastKapacitet=" + lastKapacitet +
                '}';
    }
}
