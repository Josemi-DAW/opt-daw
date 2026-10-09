package com.example.actividad4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablaController {

    @GetMapping("/tabla")
    public String tabla(@RequestParam(name = "filas", required = false) String filas,
                        @RequestParam(name = "columnas", required = false) String columnas) {

        int numFilas = 1;
        int numColumnas = 1;

        try {
            if (filas != null) {
                numFilas = Integer.parseInt(filas);
            }
        } catch (NumberFormatException e) {
            numFilas = 1;
        }

        try {
            if (columnas != null) {
                numColumnas = Integer.parseInt(columnas);
            }
        } catch (NumberFormatException e) {
            numColumnas = 1;
        }

        if (numFilas < 1) {
            numFilas = 1;
        }

        if (numFilas > 20) {
            numFilas = 20;
        }

        if (numColumnas < 1) {
            numColumnas = 1;
        }

        if (numColumnas > 20) {
            numColumnas = 20;
        }

        String tabla = "";

        tabla += "<table border='1'>";

        tabla += "<tr>";

        for (int i = 1; i <= numColumnas; i++) {
            tabla += "<th>Columna " + i + "</th>";
        }

        tabla += "</tr>";

        for (int i = 1; i <= numFilas; i++) {

            tabla += "<tr>";

            for (int j = 1; j <= numColumnas; j++) {
                tabla += "<td>Fila " + i + ", Columna " + j + "</td>";
            }

            tabla += "</tr>";
        }

        tabla += "</table>";

        return tabla;
    }
}

