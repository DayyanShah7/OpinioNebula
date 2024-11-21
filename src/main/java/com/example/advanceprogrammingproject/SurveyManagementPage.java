package com.example.advanceprogrammingproject;

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

public class SurveyManagementPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private ImageView SurveyManagementLogo;
    @FXML private ImageView SurveyManagementIcon;
    @FXML private ImageView AddIcon;
    @FXML private ImageView ViewIcon;
    @FXML private ImageView DeleteIcon;
    @FXML private Text SurveyManagementText;
    @FXML private Text WhatText;
    @FXML private Button BackButtonOnSurveyManagement;
    @FXML private Button AddSurveyButton;
    @FXML private Button ViewSurveyButton;
    @FXML private Button BackButtonOnDeleteUser2;

    // Method to handle the action for adding a survey
    public void AddSurvey(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminAddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle the action for viewing surveys
    public void ViewSurvey(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminViewSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle the action for deleting surveys
    public void DeleteSurvey(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AdminDeleteSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle the action for navigating back to the previous page
    public void BackButtonOnSurveyManagement(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AfterAdminLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
