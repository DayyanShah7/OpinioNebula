package com.example.advanceprogrammingproject;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Main extends Application {

    Image image = new Image("file:///C:/Users/dayya/OneDrive/Pictures/Icons/Icons2/galaxy.png");

    // Start method for initializing the application
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("StartPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setResizable(false);
        stage.getIcons().add(image);
        stage.setTitle("OpinioNebula");
        stage.setScene(scene);
        stage.show();

        // Timeline to switch to the WelcomePage after 3 seconds
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            try {
                FXMLLoader next = new FXMLLoader(getClass().getResource("WelcomePage.fxml"));
                Parent nextroot = next.load();
                Stage nextStage = new Stage();
                nextStage.setTitle("OpinioNebula");
                nextStage.setScene(new Scene(nextroot));
                nextStage.show();
                nextStage.getIcons().add(image);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        timeline.play();
    }

    // Main method to launch the application
    public static void main(String[] args) {
        launch();
    }
}
