package com.odsys.Reto5;

import com.odsys.Reto5.controller.Controller;
import com.odsys.Reto5.view.Interfaz;

public class App {

    public static void main(String[] args) throws Exception {
        //Pruebas locales
        //Controller controller = new Controller("jdbc:mysql://localhost:3306/ProyectosConstruccion");
      //  Controller controller = new Controller("jdbc:mysql:ProyectosConstruccion.db");

        Interfaz i = new Interfaz("jdbc:mysql://localhost:3306/ProyectosConstruccion");
        i.setVisible(true);
/*
        controller.req1();
        controller.printReq1();
        controller.req2();
        controller.printReq2();
        controller.req3();
        controller.printReq3();*/
    }
}
