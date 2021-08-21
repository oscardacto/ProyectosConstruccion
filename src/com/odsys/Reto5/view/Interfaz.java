package com.odsys.Reto5.view;

import com.odsys.Reto5.controller.Controller;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Interfaz extends JFrame{
    
    //se crea el atributo o relacion
    private PanelBotones panelBotones;
    private PanelLista panelLista;
    private Controller controlador;

    public Interfaz(String url){
        super();
        setLayout(new BorderLayout());
        setSize(450,800);
        panelBotones = new PanelBotones(this);
        panelLista = new PanelLista(this);

        controlador = new Controller(url);

        add(panelBotones,BorderLayout.SOUTH);
        add(panelLista,BorderLayout.CENTER);


    }
    public void updateLista1(){
        controlador.req1();
        req1(controlador.getReq1s());
    }
    public void updateLista2(){
        controlador.req2();
        req2(controlador.getReq2s());
    }


    public void updateLista3(){
        controlador.req3();
        req3(controlador.getReq3s());
    }

    public void req1(ArrayList<String> listaReq1){
        String[] listado = new String[listaReq1.size()];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = listaReq1.get(i);
        }
        panelLista.updateLista(listado);
    }

    public void req2(ArrayList<String> listaReq2){
        String[] listado = new String[listaReq2.size()];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = listaReq2.get(i);
        }
        panelLista.updateLista(listado);
    }

    public void req3(ArrayList<String> listaReq3){
        String[] listado = new String[listaReq3.size()];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = listaReq3.get(i);
        }
        panelLista.updateLista(listado);
    }


/*
    public static void main(String[] args) {
        Interfaz inter = new Interfaz();
        inter.setVisible(true);
    }*/
}
