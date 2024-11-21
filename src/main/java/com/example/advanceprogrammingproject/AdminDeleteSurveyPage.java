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
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDeleteSurveyPage {


    private Stage stage;
    private Scene scene;
    private Parent root;


    /*
    control variables for admin delete survey
     */
    @FXML private ImageView AdminDeleteSurveyLogo;
    @FXML private ImageView AdminDeleteSurveyIcon;
    @FXML private Text DeleteSurveyTextOnAdminDeleteSurvey;
    @FXML private Text SurveyIDText;
    @FXML private Text SurveyCreatedByText;
    @FXML private Text ds7Text;
    @FXML private Text IDValueText;
    @FXML private Text QnAText;
    @FXML private Text SurveyTypeText;
    @FXML private Button BackButtonOnAdminDeleteSurvey;
    @FXML private ListView MainList;
    @FXML private ListView SurveyCreatedByList;
    @FXML private ListView SurveyIDList;
    @FXML private CheckBox DeleteCheckBox;

    /*
    Handles a button click to navigate back to the Admin View Survey view.
     */
    public void BackButtonOnAdminDeleteSurvey (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminViewSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    /*
    Handles the deletion of a survey by navigating to the AdminDeleteSurvey1 view if the delete checkbox is selected.
     */
    public void DeleteButtonOnAdminDeleteSurvey (ActionEvent event) throws IOException {

        if (DeleteCheckBox.isSelected()) {
            try {

                Parent root = FXMLLoader.load(getClass().getResource("AdminDeleteSurvey1.fxml"));
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



    /*
    control variables for admin delete survey 1
     */
    @FXML private ImageView AdminDeleteSurvey1Logo;
    @FXML private ImageView AdminDeleteSurvey1Icon;
    @FXML private Text AdminDeleteSurveyOnAdminDeleteSurvey1Text;
    @FXML private Text DeleteText1OnAdminDeleteSurvey1;
    @FXML private Text DeleteText2OnAdminDeleteSurvey1;
    @FXML private Text UserIDTextOnAdminDeleteSurvey1;
    @FXML private Text QuestionAnswerTextOnAdminDeleteSurvey1;
    @FXML private Text IDTextOnAdminDeleteSurvey1;
    @FXML private Text WarningText;
    @FXML private Button DeleteButtonOnAdminDeleteSurvey1;
    @FXML private Button BackButtonOnAdminDeleteSurvey1;


    /*
    Handles a button click to navigate back to the Admin Delete Survey view.
     */
    public void BackButtonOnAdminDeleteSurvey1 (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminDeleteSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
    /*
    Initiates the deletion confirmation process by loading the AdminDeleteSurveyConfirm view.
     */
    public void DeleteButtonOnAdminDeleteSurvey1 (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminDeleteSurveyConfirm.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    ////
    ////
    ////
    ////
    ////


    /*
    control variables for admin delete survey confirm
     */
    @FXML private ImageView AdminDeleteSurveyConfirmLogo;
    @FXML private ImageView AdminDeleteSurveyConfirmIcon;
    @FXML private ImageView DoneIcon;
    @FXML private Text AdminDeleteSurveyConfirmText;
    @FXML private Text AdminSurveyDeletedSuccessfullyDeletedText2;
    @FXML private Button HomeButtonOnAdminDeleteSurveyConfirm;


    /*
   Handles a button click to navigate back to the Survey Management view.
    */
    public void HomeButtonOnAdminDeleteSurveyConfirm (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("SurveyManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}
