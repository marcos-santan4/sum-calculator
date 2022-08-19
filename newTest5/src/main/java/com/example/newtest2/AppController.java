package com.example.newtest2;


import com.example.newtest2.gui.util.Alerts;
import com.example.newtest2.gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class AppController implements Initializable {
    @FXML
    private TextField txtNumber1;
    @FXML
    private TextField txtNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private Button btSum;

    @FXML
    public void onBtSumAction() {
        try {
            Locale.setDefault(Locale.US);
            double number1  = Double.parseDouble(txtNumber1.getText());
            double number2  = Double.parseDouble(txtNumber2.getText());
            double sum = number1 + number2;
            //double sum2 = Double.parseDouble(txtNumber1.getText()) + Double.parseDouble(txtNumber2.getText());
            labelResult.setText(String.format("%.2f", sum));
        } catch (NumberFormatException e) {
            Alerts.showAlert("Error - Parse Error", null, e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldDouble(txtNumber2);
    }
}
