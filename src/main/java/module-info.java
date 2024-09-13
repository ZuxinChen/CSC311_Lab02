module com.example.csc311_lab02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_lab02 to javafx.fxml;
    exports com.example.csc311_lab02;
}