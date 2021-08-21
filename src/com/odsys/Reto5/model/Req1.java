package com.odsys.Reto5.model;

public class Req1 {
    private int ID_Proyecto;
    private String Pagado;
    private String Proveedor;
    private int total;


    public Req1( int ID_Proyecto, String Pagado, String Proveedor,int total) {
        this.ID_Proyecto = ID_Proyecto;
        this.Pagado = Pagado;
        this.Proveedor = Proveedor;
        this.total = total;

    }

    @Override
    public String toString() {
        return "Req1{" +
                "ID_Proyecto=" + ID_Proyecto +
                ", Pagado='" + Pagado + '\'' +
                ", Proveedor='" + Proveedor + '\'' +
                ", total=" + total +
                '}';
    }
}
