package com.example.lab6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FirstController {

    @FXML
    private ColorPicker colorPicker;


    @FXML
    private Circle circle;

    @FXML
    private TextField radiusField;

    @FXML
    void calc() {
        calculate();
    }



    @FXML
    void calculate() {
        try {

            com.example.lab6.Circle circle = com.example.lab6.Circle.getInstance();
            circle.setRadius(Double.parseDouble(radiusField.getText()));
            circle.calsulate();
        }
        catch (Exception ignored){

        }
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(RunApplication.class.getResource("second-form.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage anotherStage = new Stage();
            anotherStage.setTitle("Results");
            anotherStage.setScene(scene);
            anotherStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void circlepress(KeyEvent event) {
        System.out.println("circle pressed");
    }

    @FXML
    void colorchange(ActionEvent event) {
        circle.setFill(colorPicker.getValue());
    }

    @FXML
    void radius(ActionEvent event) {

    }

    @FXML
    void changeRadius(KeyEvent event) {
        try {
            double d = Double.parseDouble(radiusField.getText());
            if (d < 151)
                circle.setRadius(Double.parseDouble(radiusField.getText()));
            else circle.setRadius(150);
        }
        catch (Exception ignored){

        }
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }


    @FXML
    void initialize(){
        ContextMenu cm  =new ContextMenu();
        MenuItem a = new MenuItem("Видалити");
        MenuItem b = new MenuItem("Коло");
        ColorPicker cp = new ColorPicker();
        MenuItem c = new MenuItem("Змінити колір", cp);

        cm.getItems().addAll(a,b,c);
        circle.setOnMouseClicked(t -> {
            if(t.getButton().toString().equals("SECONDARY"))
                cm.show(circle,t.getScreenX(),t.getSceneY());
            cm.setOnAction(e -> {
                if(e.getTarget() == a) circle.setVisible(false);
                if(e.getTarget() == b) circle.setFill(Color.valueOf("#e7ffde"));
                try {
                    if (e.getTarget() == c) circle.setFill((cp.getValue()));
                }
                catch (Exception ignored){

                }
            });
        });
    }

}