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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdminForgetsPasswordPage {


    private Stage stage;
    private Scene scene;
    private Parent root;

    ////
    ////
    ////
    ////
    ////
    //This is the page for AdminSecurityQuestionForPasswordReset

    /*
    control variables for forgets password
     */
    @FXML private ImageView ForgetPasswordLogo;
    @FXML private ImageView ForgetPasswordIcon;
    @FXML private Text ForgetPasswordText;
    @FXML private Text RecoverText;
    @FXML private Text QuestionText;
    @FXML private TextField ForgotPasswordTextField;
    @FXML private TextField AnswerField;
    @FXML private Button BackButton;
    @FXML private Button ConfirmButton;
    @FXML private Label WrongData;


    /*
    Handles a button click to navigate back to the Admin Login view.
     */
    public void Back(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    /*
    Validates the input against stored data and proceeds to the AdminForgetPassword view upon successful login confirmation.
     */
    public void Confirm(ActionEvent event) throws IOException {

        String answerField = AnswerField.getText();

        try (BufferedReader reader = new BufferedReader(new FileReader("AdminPasswordFile.txt"))) {

            String line;
            boolean loggedIn = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String storedAnswerField = parts[0];


                if (answerField.equals(storedAnswerField)) {
                    loggedIn = true;
                    break;


                }
                WrongData.setText("Succesfull Login");
            }

            if (loggedIn) {
                Parent root = FXMLLoader.load(getClass().getResource("AdminForgetPassword.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();


            } else {
                WrongData.setText("Incorrect Details. Please Try Again");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    ////
    ////
    ////
    ////
    ////
    //This is beginning of the code for AdminForgetPassword.fxml file.
/*
control variables for admin forget password
 */
    @FXML private ImageView AdminForgetPasswordLogo;
    @FXML private ImageView AdminForgetPasswordIcon;
    @FXML private Text ResetPasswordText;
    @FXML private Text NewPasswordText;
    @FXML private Text ReEnterText;
    @FXML private TextField PasswordField1;
    @FXML private TextField PasswordField2;
    @FXML private Button BackButtonOnAdminForgetPassword;
    @FXML private Button ConfirmButtonOnAdminForgetPassword;

    /*
    Handles a button click to navigate back to the Admin Security question For Password view.
     */
    public void BackOnAdminForgetPassword (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminSecurityQuestionForPasswordReset.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /*
    Updates the admin password in a file and displays a success message upon a successful password reset.
     */
    public void ConfirmOnAdminForgetPassword (ActionEvent event) throws IOException {

        String newPassword = PasswordField1.getText();
        String username = "Dayyan_7";

        if (!username.isEmpty() && !newPassword.isEmpty()) {
            try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\admin.txt", true)) {

                writer.write(username + "," + newPassword + "," + "\n");
                writer.flush();
                writer.close();

                Parent root = FXMLLoader.load(getClass().getResource("AdminPasswordResetSuccessfull.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }





    ////
    ////
    ////
    ////
    ////
    // Below is the code for AdminPasswordResetSuccessfull

    @FXML private ImageView AdminPasswordResetSuccessfullLogo;
    @FXML private ImageView AdminPasswordResetSuccessfullIcon;
    @FXML private ImageView DoneIcon;
    @FXML private Text AdminPasswordResetSuccessfullText;
    @FXML private Button HomeButton;


    public void Home (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }







}

