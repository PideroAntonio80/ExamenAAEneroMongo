package com.sanvalero.examen_aa_enero_mongo;

import com.sanvalero.examen_aa_enero_mongo.domain.Equipo;
import com.sanvalero.examen_aa_enero_mongo.domain.Partido;
import com.sanvalero.examen_aa_enero_mongo.util.AlertUtils;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Creado por @ author: Pedro Orós
 * el 27/01/2021
 */

public class AppController implements Initializable {
    public TextField tfEquipo, tfPartido;

    EquipoDAO equipoDAO;

    public AppController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        equipoDAO = new EquipoDAO();
        equipoDAO.conectar();
    }

    @FXML
    public void guardar(Event event) {
        String nombreEquipo = tfEquipo.getText();

        if(nombreEquipo.equals("")) {
            AlertUtils.mostrarError("Debes rellenar el campo nombreEquipo");
            return;
        }

        Equipo equipo = new Equipo(nombreEquipo);

        equipoDAO.guardar(equipo);
    }

    @FXML
    public void borrar(Event event) {
        AlertUtils.mostrarConfirmacion("Eliminacion");

        String nombreEquipo = tfEquipo.getText();


        Equipo equipo = new Equipo(nombreEquipo);
        equipoDAO.eliminar(equipo);
    }

    @FXML
    public void guardarPartido(Event event) {
        String nombrePartido = tfPartido.getText();

        if(nombrePartido.equals("")) {
            AlertUtils.mostrarError("Debes rellenar el campo nombrePartido");
            return;
        }

        Partido partido = new Partido(nombrePartido);

        equipoDAO.guardarPartido(partido);
    }

    @FXML
    public void borrarPartido(Event event) {
        AlertUtils.mostrarConfirmacion("Eliminacion");

        String nombrePartido = tfPartido.getText();


        Partido partido = new Partido(nombrePartido);
        equipoDAO.eliminarPartido(partido);
    }

    @FXML
    public void reset(Event event) {
        limpiarCajas();
    }

    public void limpiarCajas() {
        tfEquipo.setText("");
        tfPartido.setText("");
    }
}
