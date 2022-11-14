package com.example.lab3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Figures extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Figures.class.getResource("figures.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(Figures.class.getResource("plot.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 366);
        //Scene scene = new Scene(fxmlLoader.load(), 385, 400);
        stage.setTitle("Plot!");
        stage.setScene(scene);
        stage.show();


        //створення завантажчика файлу з розміткою
        //створення сцени з даною розміткою
        // встановлення заголовку вікна
        //передаємо сцену з інтерфейсом на вікно
        //показуємо вікно
    }

    public static void main(String[] args) {
        launch();
    }
}