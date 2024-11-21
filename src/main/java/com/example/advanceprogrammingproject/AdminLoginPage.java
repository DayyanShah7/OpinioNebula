package com.example.advanceprogrammingproject;

/*
importing libraries
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AdminLoginPage {

    private Stage stage;
    private Scene scene;
    private Parent root;


    //Controls for Admin Login
    @FXML private ImageView AdminPageLogo;
    @FXML private ImageView AdminLogo;
    @FXML private ImageView UsernameLogo;
    @FXML private ImageView PasswordLogo;
    @FXML private Text AdminText;
    @FXML private Text UsernameText;
    @FXML private Text PasswordText;
    @FXML private TextField AdminUsernameField;
    @FXML private PasswordField AdminPasswordfield;
    @FXML private Button BackButtonOnAdminPage;
    @FXML private Button LoginButtonOnAdminPage;
    @FXML private Button ForgotPasswordButtonOnAdminPage;
    @FXML private Label WrongData;



    /* This is the method when admin enters username and password and tries to login, within this method the admin
    login details are compared with what is stored in admin.txt file.
     */
    public void AdminLoginButton(ActionEvent event) throws IOException {

        String username = AdminUsernameField.getText();
        String password = AdminPasswordfield.getText();


        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\admin.txt"))) {
            String line;
            boolean loggedIn = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    loggedIn = true;
                    break;


                }
                WrongData.setText("Succesfull Login");
                System.out.println("User login Success");
            }

            if (loggedIn) {
                Parent root = FXMLLoader.load(getClass().getResource("AfterAdminLogin.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();


            } else {
                WrongData.setText("Incorrect Details. Please Try Again");
                System.out.println("User login failed");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //This method is for when Admin forgets the password button.

    public void AdminForgotPassword(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminSecurityQuestionForPasswordReset.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    //This is the back button on Admin Page, when clicked this takes Admin back to welcomee page.
    public void BackOnAdminPage(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public class SharedData {
        public static String loggedInUsername;
    }


    }










