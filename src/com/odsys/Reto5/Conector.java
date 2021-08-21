package com.odsys.Reto5;


import java.sql.*;

public class Conector {
    private Connection connect;
    public Conector(String url) {
        super();
        connectDB(url);
    }

    public ResultSet getReq1DB() {
        //TODO
        String sql = "SELECT  (sum(cantidad))  as total, ID_Proyecto, Pagado, Proveedor  FROM Compra\n" +
                "where Pagado like 'NO' \n" +
                "GROUP BY ID_Proyecto\n" +
                "HAVING sum(cantidad) > 50";
        return executeQuery(sql);
    }
    public ResultSet getReq2DB() {
        //TODO
        String sql = "SELECT Proyecto.Fecha_Inicio  as inicio, Tipo.Financiable, Tipo.Estrato , Proyecto.Porcentaje_Cuota_Inicial * 100 FROM Tipo, Proyecto WHERE Proyecto.ID_Tipo = Tipo.ID_Tipo AND Proyecto.Porcentaje_Cuota_Inicial  > 0.2 AND Tipo.Estrato >= 5 AND Tipo.Financiable = 0 ORDER BY inicio ";

        return executeQuery(sql);
    }
    public ResultSet getReq3DB() {
        //TODO
        String sql = "SELECT Proyecto.ID_Proyecto, Compra.pagado, Proyecto.Clasificacion FROM MaterialConstruccion, Compra, Proyecto WHERE MaterialConstruccion.Importado = 'Si' AND Compra.ID_MaterialConstruccion = MaterialConstruccion.ID_MaterialConstruccion AND Proyecto.ID_Proyecto = Compra.ID_Proyecto AND Compra.Pagado IN ('Parcialmente','No')AND Proyecto.Clasificacion IN ('Apartamento','Apartaestudio') AND Proyecto.Acabados = 'No' GROUP BY Proyecto.ID_Proyecto";
        return executeQuery(sql);
    }
    public Connection connectDB(String url) {
        try {
            connect = DriverManager.getConnection(url, "root", "root");
            boolean isValid = connect.isValid(500);
            System.out.println(isValid ? "Connected" : "Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connect;
    }
    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            Statement stmt = connect.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
