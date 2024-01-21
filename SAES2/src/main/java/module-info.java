module com.example.saes2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.saes2 to javafx.fxml;
    exports com.example.saes2;
}