package com.company;

public class PersonVogn extends Koeretoej{
    private double hastighed;
    private String motorStørrelse;
    private double hesteKraeft;

    public PersonVogn(double vaegtafgift, String registreringsnummer, double hastighed, String motorStørrelse, double hesteKraeft) {
        super(vaegtafgift, registreringsnummer);
        this.hastighed = hastighed;
        this.motorStørrelse = motorStørrelse;
        this.hesteKraeft = hesteKraeft;
    }

    @Override
    public String toString() {
        return "PersonVogn{" +
                "vaegtafgift=" + vaegtafgift +
                ", registreringsnummer='" + registreringsnummer + '\'' +
                ", hastighed=" + hastighed +
                ", motorStørrelse='" + motorStørrelse + '\'' +
                ", hesteKraeft=" + hesteKraeft +
                '}';
    }
}
