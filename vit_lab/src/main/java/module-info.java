module com.example.vit_lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vit_lab to javafx.fxml;
    exports com.example.vit_lab;
}