package com.example.csc311_lab02;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoanController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}