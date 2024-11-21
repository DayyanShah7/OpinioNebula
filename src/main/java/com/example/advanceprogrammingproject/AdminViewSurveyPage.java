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

public class AdminViewSurveyPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    /*
    control variables for admin view survey page
     */
    @FXML
    private ImageView ViewSurveyiconLogo;
    @FXML
    private ImageView ViewSurveyIcon;
    @FXML
    private Text ViewSurveyText;
    @FXML
    private Text SurveyIDText;
    @FXML
    private Text SurveyCreatedByText;
    @FXML
    private Text ds7Text;
    @FXML
    private Text IDValueText;
    @FXML
    private Text QnAText;
    @FXML
    private Text SurveyTypeText;
    @FXML
    private Button BackButton;
    @FXML
    private ListView MainList;
    @FXML
    private ListView SurveyCreatedByList;
    @FXML
    private ListView SurveyIDList;
    @FXML
    private CheckBox ViewCheckBox;


    /*
    back button redirecting to survey management view
     */
    public void Back(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("SurveyManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    /*
    Displays the AdminViewSurveyPage2 if the ViewCheckBox is selected.
     */
    public void View(ActionEvent event) throws IOException {

        if (ViewCheckBox.isSelected()) {
            try {

                Parent root = FXMLLoader.load(getClass().getResource("AdminViewSurveyPage2.fxml"));
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

    /* This is the code for the second fxml file which is AdminViewSurveyPage2.fxml.
       This file basically shows the survey created page.
     */


    /*
    control variables for admin view survey page 2
     */
    @FXML private ImageView AdminViewSurveyPage2Logo;
    @FXML private ImageView AdminViewSurveyPage2Icon;
    @FXML private ImageView UserLogo;
    @FXML private ImageView OptionLogo;
    @FXML private ImageView IDLogo;
    @FXML private Text ViewSurveyTextOnAdminViewSurveyPage2;
    @FXML private Text UserIDText;
    @FXML private Text QuestionAnswerText;
    @FXML private Text IDText;
    @FXML private Text QuestionText1;
    @FXML private Text QuestionText2;
    @FXML private Text AnswerText1;
    @FXML private Text AnswerText2;
    @FXML private Text AnswerText3;
    @FXML private Text AnswerText4;
    @FXML private ListView QuestionList;
    @FXML private ListView AnswerList;
    @FXML private Button BackButtonOnAdminViewSurveyPage2;
    @FXML private Button HomeButtonOnAdminViewSurveyPage2;

 /*
 back button redirecting to admin view survey view
  */
    public void BackButtonOnAdminViewSurveyPage2 (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminViewSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    /*
    home button redirecting to survey management view
     */
    public void HomeButtonOnAdminViewSurveyPage2 (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("SurveyManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}










