module com.daniel.col29 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.daniel.col29 to javafx.fxml;
    exports com.daniel.col29;
}