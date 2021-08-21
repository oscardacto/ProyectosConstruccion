package com.odsys.Reto5.view;

import javax.swing.*;
import java.awt.*;


public class PanelLista extends JPanel {

    private JList<String> listaRequerimientos;

    private Interfaz vistaIndex;

    public PanelLista(Interfaz i) {
        super();
        setLayout(new GridLayout());
        vistaIndex = i;

        listaRequerimientos = new JList<>();

        add(listaRequerimientos);

       }

    public void updateLista(String[] listado) {
        listaRequerimientos.setListData(listado);
    }

}
