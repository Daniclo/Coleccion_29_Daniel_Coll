package com.daniel.col29;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Col29_Coll_ControllerEj1 {
    @FXML
    private Label textoEj1Clicks;
    int c = 0;

    @FXML
    protected void alPulsarBotonEj1() {
        c++;
        textoEj1Clicks.setText("Número de clicks = " + c);
    }
}