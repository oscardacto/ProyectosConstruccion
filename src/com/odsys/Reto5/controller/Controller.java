package com.odsys.Reto5.controller;

import com.odsys.Reto5.Conector;
import com.odsys.Reto5.model.Req1;
import com.odsys.Reto5.model.Req2;
import com.odsys.Reto5.model.Req3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
        /*
        private ArrayList<Req1> req1s;
        private ArrayList<Req2> req2s;
        private ArrayList<Req3> req3s;
        */
        private ArrayList<String> req1s;
        private ArrayList<String> req2s;
        private ArrayList<String> req3s;


        private Conector conectorDB;
        public Controller(String url) {
            super();
            //TODO inicializar las listas de reqs
            this.req1s = new ArrayList<>();
            this.req2s = new ArrayList<>();
            this.req3s = new ArrayList<>();

            conectorDB = new Conector(url);
        }

    public ArrayList<String> getReq1s() {
        return req1s;
    }

    public ArrayList<String> getReq2s() {
        return req2s;
    }

    public ArrayList<String> getReq3s() {
        return req3s;
    }

    public void req1() {
            //TODO logica de llenado de la lista req1s
            req1s.clear();
            ResultSet rs1 = conectorDB.getReq1DB();
            try {
                while (rs1.next()) {
                    Req1 req1 = new Req1(rs1.getInt("ID_Proyecto"), rs1.getString("Pagado"),rs1.getString("Proveedor"),rs1.getInt("total") );
                    req1s.add(req1.toString());
                }
            } catch (SQLException e) {
                System.out.println("Error: ");
                e.printStackTrace();
            }
        }
        public void req2() {
            //TODO logica de llenado de la lista req2s
            req2s.clear();
            ResultSet rs2 = conectorDB.getReq2DB();
            try{
                while (rs2.next()) {
                    Req2 req2 = new Req2(rs2.getInt("estrato"), rs2.getString("Inicio"), rs2.getInt("financiable"), rs2.getDouble("Proyecto.Porcentaje_Cuota_Inicial * 100"));
                    req2s.add(req2.toString());
                }
            }catch (SQLException e){
                System.out.println("ruta del error");
                e.printStackTrace();
            }
        }
        public void req3() {
            //TODO logica de llenado de la lista req3s
            req3s.clear();
            ResultSet rs3 = conectorDB.getReq3DB();
            try{
                while (rs3.next()) {
                    Req3 req3 = new Req3(rs3.getString("clasificacion"),rs3.getInt("ID_Proyecto"), rs3.getString("pagado"));
                    req3s.add(req3.toString());
                }
            }catch (SQLException e){
                System.out.println("ruta del error");
                e.printStackTrace();
            }
        }

}

