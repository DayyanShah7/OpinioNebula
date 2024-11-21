package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AfterSurveyCreatorLoginPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private ImageView AfterSurveyCreatorLoginLogo;
    @FXML private ImageView UserIcon;
    @FXML private ImageView AddIcon;
    @FXML private ImageView ViewIcon;
    @FXML private ImageView DeleteIcon;
    @FXML private Text WelcomeText;
    @FXML private Text WhatText;
    @FXML private Button BackButton;
    @FXML private Button AddSurveyButton;
    @FXML private Button ViewSurveyButton;
    @FXML private Button DeleteSurveyButton;

    // Method triggered upon clicking the "Back" button
    public void Back(ActionEvent event) throws IOException {
        // Navigate back to the previous FXML file upon clicking the "Back" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method triggered upon clicking the "Add" button
    public void Add(ActionEvent event) throws IOException {
        // Load the AddSurvey.fxml file upon clicking the "Add" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method triggered upon clicking the "View" button
    public void View(ActionEvent event) throws IOException {
        // Load the ViewSurvey.fxml file upon clicking the "View" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/ViewSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method triggered upon clicking the "Delete" button
    public void Delete(ActionEvent event) throws IOException {
        // Load the DeleteSurvey.fxml file upon clicking the "Delete" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/DeleteSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method triggered upon clicking the "Delete2" button
    public void Delete2(ActionEvent event) throws IOException {
        // Load the SurveyDeleted.fxml file upon clicking the "Delete2" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyDeleted.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
