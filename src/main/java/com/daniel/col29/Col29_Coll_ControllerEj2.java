package com.daniel.col29;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Col29_Coll_ControllerEj2 {
    @FXML
    private Label texto;

    @FXML
    private TextField leeTexto;

    @FXML
    protected void alPulsarBotonGuardaTexto(){
        texto.setText(leeTexto.getText());
    }
}
