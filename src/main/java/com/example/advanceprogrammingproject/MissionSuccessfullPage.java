package com.example.advanceprogrammingproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MissionSuccessfullPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private ImageView MissionSuccessfullLogo;
    @FXML private Text MissionText;
    @FXML private Text SurveyAddedText;
    @FXML private Button HomeButton;

    // Method to handle the action for returning to the home page
    public void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SurveyManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
