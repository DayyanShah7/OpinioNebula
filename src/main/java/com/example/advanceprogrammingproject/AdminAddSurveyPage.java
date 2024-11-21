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
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminAddSurveyPage {


    private Stage stage;
    private Scene scene;
    private Parent root;

    /*
    control variables for admin add survey
     */
    @FXML
    private ImageView AdminAddSurveyLogo;
    @FXML
    private ImageView AdminAddSurveyIcon;
    @FXML
    private Text WelcomeUserText;
    @FXML
    private Text PleaseText;
    @FXML
    private Text ToCreateText;
    @FXML
    private Button BackButtonOnAdminAddSurvey;
    @FXML
    private Button ContinueButtonOnAdminAddSurvey;
    @FXML
    private javafx.scene.control.ComboBox<String> ComboBox;

    /*
    Handles a button click to navigate back to the Survey Management view.
     */
    public void Back(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("SurveyManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    /*
    Initializes the ComboBox options for user selection.
     */
    public void initialize() {

        //The ComboBox option are initialized here, so the user can choose either of them.
        ComboBox.getItems().addAll("Question And Answer", "MCQs", "Rate out of 5");
    }

    /*
    Handles user selection from a ComboBox to navigate to different pages based on the chosen option.
     */
    public void Continue(ActionEvent event) throws IOException {
        String selectedOption = ComboBox.getValue();

        if (selectedOption != null) {

            String FXMLFile;

            switch (selectedOption) {
                case "Question And Answer":
                    FXMLFile = "AdminQuestionPage.fxml";
                    break;
                case "MCQs":
                    FXMLFile = "AdminMCQs.fxml";
                    break;
                default:
                    FXMLFile = "AdminRating.fxml";
                    break;


            }
            Parent root = FXMLLoader.load(getClass().getResource(FXMLFile));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


    }
}