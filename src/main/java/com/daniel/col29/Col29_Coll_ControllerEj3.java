package com.daniel.col29;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Col29_Coll_ControllerEj3 {
    @FXML
    private TextArea introducirTexto = new TextArea();

    @FXML
    private Label mostrarTexto = new Label();

    @FXML
    protected void alPulsarBotonMostrarTexto(){
        mostrarTexto.setText(introducirTexto.getText());
    }
}
