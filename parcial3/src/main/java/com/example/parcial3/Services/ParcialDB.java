package com.example.parcial3.Services;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.parcial3.Helpers.Conexion;
import com.example.parcial3.Entities.Titulos;

public class ParcialDB {

    private Connection _cn;

    public ParcialDB() {
        this._cn = new Conexion().openDb();
    }

    public List<Titulos> obtenerTodosLosTitulos() {
        List<Titulos> titulos = new ArrayList<>();

        try (Statement smtm = _cn.createStatement();
             ResultSet result = smtm.executeQuery("SELECT * FROM titulos")) {

            while (result.next()) {
                Titulos titulo = new Titulos(
                    result.getString("nombre"),
                    result.getString("link")
                );
                titulos.add(titulo);
            }

        } catch (Exception e) {
            e.printStackTrace(); // Imprimir la traza de la excepción para depuración
        }

        return titulos;
    }
}
