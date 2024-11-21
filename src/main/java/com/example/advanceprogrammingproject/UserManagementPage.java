package com.example.advanceprogrammingproject;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserManagementPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private ImageView UserManagementIcon;
    @FXML private ImageView AddUserIcon;
    @FXML private ImageView ViewUserIcon;
    @FXML private ImageView DeleteUserIcon;
    @FXML private Text UserManagementText;
    @FXML private Button AddUserButtonOnUserManagementPage;
    @FXML private Button ViewUserButtonOnUserManagementPage;
    @FXML private Button DeleteUserButtonOnUserManagementPage;
    @FXML private Button BackButtonOnUserManagementPage;
    @FXML private Button ViewUser2;

    // Method to handle adding a user and navigating to the AddUser page
    public void AddUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle viewing users and navigating to the ViewUser page
    public void ViewUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle deleting a user and navigating to the DeleteUser page
    public void DeleteUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DeleteUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle navigating back to the previous page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AfterAdminLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle viewing users and navigating to the ViewUser2 page
    public void ViewUser2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewUser2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML private Text MissionText;
    @FXML private Button HomeButton;

    // Method to handle navigating back to the UserManagement page
    public void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
