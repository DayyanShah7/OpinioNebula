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
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteUserPage {

    /* This class act as a controller for multiple FXML file namely DeleteUSer, FirstOptionDeleteUser,
    SecondThirdOptionDeleteUser and ThirdOptionDeleteUser, before the beginning of each code it is mentioned which snippet
    belong to whcich file.
     */

    private Stage stage;
    private Scene scene;
    private Parent root;

    //Below is the code for DeleteUser File

    // controls for delete user
    @FXML private ImageView DeleteUserLogo;
    @FXML private ImageView DeleteUserIcon;
    @FXML private Text DeleteUserText;
    @FXML private Text username1Text;
    @FXML private Text username2Text;
    @FXML private Text username3Text;
    @FXML private Text studentID1Text;
    @FXML private Text studentID2Text;
    @FXML private Text studentID3Text;
    @FXML private Button BackButtonOnDeleteUser;
    @FXML private Rectangle HeaderBox;
    @FXML private Rectangle UsernameBox;
    @FXML private Rectangle StudentIDBox;
    @FXML private Button ConfirmButton;
    @FXML private CheckBox FirstCheckBox;
    @FXML private CheckBox SecondCheckBox;
    @FXML private CheckBox ThirdCheckBox;


    // When clicked redirects user to the previous Page
    public void BackButtonOnDeleteUser(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FirstOptionDeleteUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /* Confirm is the button which when clicked stores the option user choosed and take any step accordingly
   As there are three checkboxes each handling different events when clicked
     */

    public void Confirm(ActionEvent event) throws IOException {

        if (FirstCheckBox.isSelected()) {
            Parent root = FXMLLoader.load(getClass().getResource("FirstOptionDeleteUser.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else if (SecondCheckBox.isSelected()) {

            Parent root = FXMLLoader.load(getClass().getResource("SecondOptionDeleteUser.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else if (ThirdCheckBox.isSelected()) {

            Parent root = FXMLLoader.load(getClass().getResource("ThirdOptionDeleteUser.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }

    // This is the code for FirstOptionDeleteUser.

    // controls for first option deleter user
    @FXML private ImageView FirstOptionDeleteUserLogo;
    @FXML private ImageView FirstOptionDeleteIcon;
    @FXML private Text DeleteUserTextOnFirstOptionDeleteUser;
    @FXML private Text DeleteText1OnFirstOptionDeleteUser;
    @FXML private Text DeleteText2OnFirstOptionDeleteUser;
    @FXML private Text DeleteText3OnFirstOptionDeleteUser;
    @FXML private Button BackButtonOnFirstOptionDeleteUser;
    @FXML private Button ConfirmButtonOnFirstOptionDeleteUser;



    // When clicked redirects user to the previous Page
    public void BackOnFirstOptionDeleteUser (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("DeleteUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Handles the confirmation of deleting a user by loading a success message window and displaying it
    public void ConfirmOnFirstOptionDeleteUser (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserSuccessfullyDeleted.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    //This is the code for SecondOptionDeleteUser

    //controls for second option delete user
    @FXML private ImageView SecondOptionDeleteUserLogo;
    @FXML private ImageView SecondOptionDeleteIcon;
    @FXML private Text DeleteText1OnSecondOptionDeleteUser;
    @FXML private Text DeleteText2OnSecondOptionDeleteUser;
    @FXML private Text DeleteText3OnSecondOptionDeleteUser;
    @FXML private Button BackButtonOnSecondOptionDeleteUser;
    @FXML private Button ConfirmButtonOnSecondOptionDeleteUser;


    // When clicked redirects user to the previous Page
    public void BackOnSeocndUserDeleteUser (ActionEvent event ) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("DeleteUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    // Handles the confirmation of deleting a user through an alternate option by displaying a success message window
    public void ConfirmOnSecondOptionDeleteUser (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserSuccessfullyDeleted.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }


    //controls for third option delete user
    @FXML private ImageView ThirdOptionDeleteUserLogo;
    @FXML private ImageView ThirdOptionDeleteIcon;
    @FXML private Text DeleteText1OnThirdOptionDeleteUser;
    @FXML private Text DeleteText2OnThirdOptionDeleteUser;
    @FXML private Text DeleteText3OnThirdOptionDeleteUser;
    @FXML private Button BackButtonOnThirdOptionDeleteUser;
    @FXML private Button ConfirmButtonOnThirdOptionDeleteUser;

    // When clicked redirects user to the previous Page


    public void BackOnThirdOptionDeleteUser (ActionEvent event ) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("DeleteUser.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    // Manages user deletion confirmation via a third option, displaying a success message window
    public void ConfirmOnThirdOptionDeleteUser (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserSuccessfullyDeleted.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    //controls for user successfully deleted
    @FXML private ImageView UserSuccessfullyDeletedLogo;
    @FXML private ImageView UserSuccessfullyDeletedIcon;
    @FXML private ImageView DoneIcon;
    @FXML private Text UserSuccessfullyDeletedText1;
    @FXML private Text UserSuccessfullyDeletedText2;
    @FXML private Button ConfirmButtonOnUserSuccessfullyDeleted;

    // Handles the confirmation button click on successful user deletion, returning to the User Management view
    public void ConfirmButtonOnUserSuccessfullyDeleted (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }



}