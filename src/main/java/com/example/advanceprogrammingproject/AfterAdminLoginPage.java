package com.example.advanceprogrammingproject;

/*
importing libraries
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AfterAdminLoginPage {

    private Stage stage;
    private Scene scene;
    private Parent root;



    //Controls for AfterAdminLogin.fxml file
    @FXML private ImageView AfterAdminLoginLogo;
    @FXML private ImageView AdminIcon;
    @FXML private ImageView ManageUserIcon;
    @FXML private ImageView ManageSurveyIcon;
    @FXML private Text WhatText;
    @FXML private Button BackButtonOnAfterAdminLoginPage;
    @FXML private Button ManageUserButtonOnAfterAdminLoginPage;
    @FXML private Button ManageSurveyButtonOnAfterAdminLoginPage;
    @FXML private Label WelcomeLabel;






/*
 Navigates to the UserManagement view for managing users.
 */
    public void ManageUser (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


    //ManageSurvey is the button which when clicked redirects user to SurveyManagment Page
    public void ManageSurvey (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("SurveyManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //Below is the code for the back button which is on admin login page
    public void BackButtonAfterAdminLoginPage (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}




