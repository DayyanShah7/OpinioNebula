package com.example.advanceprogrammingproject;

/*
importing libraries
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class AddUserPage implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    /*
    control variables for add user
     */
    @FXML private ChoiceBox<String> GenderBox;
    @FXML private ImageView AddUserIcon2;
    @FXML private Text AddUserText;
    @FXML private Text NameText;
    @FXML private Text UsernameText;
    @FXML private Text EmailText;
    @FXML private Text StudentIDText;
    @FXML private Text GenderText;
    @FXML private TextField UsernameField;
    @FXML private TextField EmailField;
    @FXML private TextField StudentIDField;
    @FXML private TextField NameField;
    @FXML private PasswordField PasswordField;
    @FXML private Button RegisterButtonOnAddUser;
    @FXML private Button BackButtonOnAddUser;
    @FXML private Label WrongData;


    private String[] GenderList = {"Male", "Female", "Anything in Between"};

    /*
     Populating the items in the GenderBox
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GenderBox.getItems().addAll(GenderList);

    }

    /*
    Handles a button click to navigate back to the User Management view.
     */
    public void BackButton(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

   /*
   Registers a new user, validates input, and checks for existing user data before adding.
    */
    public void RegisterButtonOnAddUser(ActionEvent event) throws IOException {

        String name = NameField.getText();
        String username = UsernameField.getText();
        String studentID = StudentIDField.getText();
        String email = EmailField.getText();
        String password = PasswordField.getText();
        String gender = GenderBox.getValue();


        if (!name.isEmpty() && !password.isEmpty()) {
            try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt", true)) {

                writer.write( name +","+  username + "," + studentID + ","+ email + "," +  "," + password + "," + gender + "\n");
                writer.flush();
                writer.close();

                Parent root = FXMLLoader.load(getClass().getResource("SuccessfullyAddedorDeleted.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();


            } catch (IOException e) {
                e.printStackTrace();

            }
        } else if (NameField.getText().isEmpty() || UsernameField.getText().isEmpty() || EmailField.getText().isEmpty() || StudentIDField.getText().isEmpty() || PasswordField.getText().isEmpty() ) {

            WrongData.setText("Text  cannot be left Blank");
        }
        {

            /*Below is the code which check that if the user has already registered before and if the user registers
            again by using the same details such as username or email then an error message is shown with the help
            of the LABEL called WRONGDATA.
             */


            String nameCheck = NameField.getText();
            String usernameCheck = UsernameField.getText();
            String emailCheck = EmailField.getText();
            String studentIDCheck = StudentIDField.getId();
            String passwordCheck = PasswordField.getText();
            String genderCheck = GenderBox.getValue();



            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt"))) {
                String line;


                boolean usernameExists = false;
                boolean emailExists = false;
                boolean studentIDExists = false;


                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length >= 3) {

                        }
                        if (parts[0].equals(usernameCheck)) {
                            usernameExists = true;
                        }
                        if (parts.length >= 4 && parts[1].equals(emailCheck)) {
                            emailExists = true;
                        }
                        if (parts.length >= 5 && parts[2].equals(studentIDCheck)) {
                            studentIDExists = true;
                        }
                    }

                if (usernameExists) {
                    WrongData.setText("Username Exists");

                } else if (emailExists) {
                    WrongData.setText("Email Exists");

                } else if (studentIDExists) {
                    WrongData.setText("StudentID Exists");

            } else {
                    FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt", true);
                    writer.write(nameCheck + "," +usernameCheck + "," + studentIDCheck + "," + "," + emailCheck + "," + passwordCheck + "," + genderCheck + "\n");
                    writer.close();

                    WrongData.setText("Registration successful!");

                    Parent root = FXMLLoader.load(getClass().getResource("SuccessfullyAddedorDeleted.fxml"));
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();


                }
            } catch (IOException e) {
                WrongData.setText("Error reading or writing to the user file.");
            }
        }


    }
}









