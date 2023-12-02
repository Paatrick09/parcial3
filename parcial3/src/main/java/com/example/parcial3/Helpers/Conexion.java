package com.example.parcial3.Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  int x;
  public Connection openDb() {
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // cambiar el driver de la conexion a sql server 
      return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=parcial_ds_4", "parcial3","1234" );
   } catch (SQLException e) {
      x = 1;
    } catch (ClassNotFoundException cnfex) {
      x = 1;
    }
    return null;
  }
}