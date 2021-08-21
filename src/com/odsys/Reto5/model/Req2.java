package com.odsys.Reto5.model;

public class Req2 {

    private int Estrato;
    private String Fecha_Inicio;
    private int Financiable;
    private double porcetaje;

    public Req2(int estrato, String fecha_Inicio, int financiable, double porcetaje) {
        Estrato = estrato;
        Fecha_Inicio = fecha_Inicio;
        Financiable = financiable;
        this.porcetaje = porcetaje;
    }

    @Override
    public String toString() {
        return "Req2{" +
                "Estrato=" + Estrato +
                ", Fecha_Inicio='" + Fecha_Inicio + '\'' +
                ", Financiable=" + Financiable +
                ", porcetaje=" + porcetaje +
                '}';
    }
}
