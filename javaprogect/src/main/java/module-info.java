module com.example.javaprogect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaprogect to javafx.fxml;
    exports com.example.javaprogect;
}