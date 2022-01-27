package com.bramerlabs.calendar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class CalendarApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalendarApplication.class.getResource("calendar-view.fxml"));
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        Scene scene = new Scene(fxmlLoader.load(), screenBounds.getWidth() * 0.75,
                screenBounds.getHeight() * 0.75);
        stage.setTitle("Calendar");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
