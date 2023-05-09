package com.daniel.col29;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Col29_Coll_ControllerEj4 {

    @FXML
    private Label texto = new Label();
    @FXML
    private CheckBox negrita = new CheckBox();
    @FXML
    private CheckBox cursiva = new CheckBox();
    @FXML
    protected void cuandoEsteMarcadoAplicar(){
        if (cursiva.isSelected() && !negrita.isSelected()){
            texto.setStyle("-fx-font-style: italic;-fx-font-weight: normal");
        }else if (!cursiva.isSelected() && !negrita.isSelected()){
            texto.setStyle("-fx-font-style: regular;-fx-font-weight: normal");
        } else if (cursiva.isSelected() && negrita.isSelected()){
            texto.setStyle("-fx-font-style: italic;-fx-font-weight: bold");
        }else if (negrita.isSelected() && !cursiva.isSelected()){
            texto.setStyle("-fx-font-weight: bold;-fx-font-style: regular");
        }
    }
}