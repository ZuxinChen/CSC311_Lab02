package com.example.csc311_lab02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoanCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoanCalculator.class.getResource("LoanCalculator-view.fxml"));
        AnchorPane root = new AnchorPane();
        fxmlLoader.setRoot(root); // set the root as Anchor Pane type
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Loan Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}