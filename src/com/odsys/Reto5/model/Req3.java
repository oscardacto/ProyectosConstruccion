package com.odsys.Reto5.model;

public class Req3 {
    private String clasificacion;
    private int idProyecto;
    private String pagado;

    public Req3(String clasificacion, int idProyecto, String pagado) {
        this.clasificacion = clasificacion;
        this.idProyecto = idProyecto;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Req3{" +
                "clasificacion='" + clasificacion + '\'' +
                ", idProyecto=" + idProyecto +
                ", pagado='" + pagado + '\'' +
                '}';
    }
}
