package com.company;

public class Bus extends Koeretoej{
    private int passagerer;
    private int antalDoere;

    public Bus(double vaegtafgift, String registreringsnummer, int passagerer, int antalDoere) {
        super(vaegtafgift, registreringsnummer);
        this.passagerer = passagerer;
        this.antalDoere = antalDoere;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passagerer=" + passagerer +
                ", antalDoere=" + antalDoere +
                ", vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                '}';
    }
}
