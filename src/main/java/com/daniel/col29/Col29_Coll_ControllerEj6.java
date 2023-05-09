package com.daniel.col29;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Col29_Coll_ControllerEj6{
    @FXML
    private RadioButton primavera = new RadioButton();
    @FXML
    private RadioButton verano = new RadioButton();
    @FXML
    private RadioButton otoño = new RadioButton();
    @FXML
    private RadioButton invierno = new RadioButton();
    @FXML
    private Label texto = new Label();

    @FXML
    protected void alMarcarOpcionCambiarTexto(){
        if (primavera.isSelected()){
            texto.setText("Primavera");
        }else if (verano.isSelected()){
            texto.setText("Verano");
        }else if (otoño.isSelected()){
            texto.setText("Otoño");
        }else if (invierno.isSelected()){
            texto.setText("Invierno");
        }
    }
}