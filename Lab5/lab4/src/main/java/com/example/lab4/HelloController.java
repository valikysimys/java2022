package com.example.lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController implements Initializable{

    @FXML
    private MenuItem che;

    @FXML
    private MenuItem cher;

    @FXML
    private MenuItem cherk;

    @FXML
    private MenuButton city;

    @FXML
    private TextField email;

    @FXML
    private MenuItem kiyv;

    @FXML
    private MenuItem lviv;

    @FXML
    private MenuItem myk;

    @FXML
    private TextField name;

    @FXML
    private TextField number;

    @FXML
    private MenuItem odesa;

    @FXML
    private Button okButton;

    @FXML
    private CheckBox radio;

    @FXML
    private MenuItem ter;

    @FXML
    private MenuItem xar;

    @FXML
    private MenuItem xer;

    //однотипний код, змінює напис в ButtonMenu на обране місто
    @FXML
    void che(ActionEvent event) {
        city.setText(che.getText());
    }

    @FXML
    void cher(ActionEvent event) {
        city.setText(cher.getText());
    }

    @FXML
    void cherk(ActionEvent event) {
        city.setText(cherk.getText());
    }

    @FXML
    void city(ActionEvent event) {
        enableButton();
    }

    @FXML
    void email(ActionEvent event) {
        enableButton();
    }

    @FXML
    void kiyv(ActionEvent event) {
        city.setText(kiyv.getText());
    }

    @FXML
    void lviv(ActionEvent event) {
        city.setText(lviv.getText());
    }

    @FXML
    void myk(ActionEvent event) {
        city.setText(myk.getText());
    }

    @FXML
    void name(ActionEvent event) {
        enableButton();
    }

    @FXML
    void number(ActionEvent event) {
        enableButton();
    }

    @FXML
    void odesa(ActionEvent event) {
        city.setText(odesa.getText());
    }

    //при натисканні на кнопку відпрацьовує даний код
    @FXML
    void okButton(ActionEvent event) {
        //зчитуємо данні з полів
        String fullName = name.getText();
        //валідація імені
        Pattern namePattern =  Pattern.compile("[А-Я][а-я]+\\s[А-Я][а-я]+");
        //валідація номеру телефона
        Pattern telPattern = Pattern.compile("\\+[1-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}");
        Matcher natcherName = namePattern.matcher(fullName);
        String tel = number.getText();
        System.out.println(telPattern.matcher(tel).matches());
        String mail = email.getText();


        //якщо все введено правильно, висвічуємо модальне вікно, яке закривається при натисканні на кнопку
        if(!city.getText().equals("Обрати місто") && radio.isSelected() && natcherName.matches() && isValidEmailAddress(mail)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "З Вами зв'яжуться!");
            alert.showAndWait();
            System.exit(0);
        }
        //якщо є помилки, попереджуємо користувача і повертаємось на форму знову
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Введено неправильні дані!");
            alert.showAndWait();
            alert.close();
        }

    }

    @FXML
    void radio(ActionEvent event) {
        enableButton();
    }

    @FXML
    void ter(ActionEvent event) {
        city.setText(ter.getText());
    }

    @FXML
    void xar(ActionEvent event) {
        city.setText(xar.getText());
    }

    @FXML
    void xer(ActionEvent event) {
        city.setText(xer.getText());
    }

    //трішки прикрашаємо кнопку при старті програми
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        okButton.setFocusTraversable(false);
        okButton.setPickOnBounds(false);
        okButton.setDisable(true);
    }

    //розблокування кнопки, якщо всі поля заповнені
    @FXML
    public void enableButton(){
        String fullName = name.getText();
        String tel = number.getText();
        String mail = email.getText();

        okButton.setDisable(fullName.length() <= 0 || tel.length() <= 0 || mail.length() <= 0 || !radio.isSelected() || city.getText().equals("Обрати місто"));

    }

    //валідація емейлу
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }


}