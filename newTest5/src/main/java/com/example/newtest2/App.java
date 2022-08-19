package com.example.newtest2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader init = new FXMLLoader(getClass().getResource("/gui/interface.fxml"));
        Scene scene = new Scene(init.load());
        stage.setScene(scene);
        stage.show();
    }
}
