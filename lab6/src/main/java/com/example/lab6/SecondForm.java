package com.example.lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class SecondForm {
    @FXML
    private Button exitButton;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private TextFlow textFlow;

    @FXML
    public void initialize() {
        Circle circle = Circle.getInstance();
        System.out.println(circle);
        Text text = new Text("Radius: " + circle.getRadius() + "\nArea: " + circle.getArea() + "\nLength: " + circle.getLength());
        textFlow.getChildren().add(text);
        textFlow.setTextAlignment(TextAlignment.LEFT);
    }

    @FXML
    void back(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
}
