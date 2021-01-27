package com.sanvalero.examen_aa_enero_mongo;

import com.sanvalero.examen_aa_enero_mongo.util.R;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Creado por @ author: Pedro Orós
 * el 27/01/2021
 */
public class App extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(R.getUI("examen_aa_enero_mongo.fxml"));
        loader.setController(new AppController());
        VBox vbox = loader.load();

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch();
    }
}
