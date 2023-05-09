package com.daniel.col29;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;

public class Col29_Coll_ControllerEj5 implements Initializable {
    @FXML
    private ComboBox<String> colores = new ComboBox<>();
    @FXML
    private Rectangle rectangulo = new Rectangle();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colores.setItems(FXCollections.observableArrayList("Rojo","Azul","Verde"));
    }
    @FXML
    protected void alElegirColorCambiaRectangulo(){
        if (colores.getValue().equals("Rojo")){
            rectangulo.setFill(Color.RED);
        } else if (colores.getValue().equals("Azul")) {
            rectangulo.setFill(Color.BLUE);
        } else if (colores.getValue().equals("Verde")){
            rectangulo.setFill(Color.GREEN);
        }
    }
}