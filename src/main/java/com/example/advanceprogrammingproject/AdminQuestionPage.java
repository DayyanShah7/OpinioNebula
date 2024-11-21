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
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AdminQuestionPage {


    private Stage stage;
    private Scene scene;
    private Parent root;

/*
control variables for admin questions
 */
    @FXML
    private ImageView AdminQuestionPageLogo;
    @FXML
    private ImageView AdminQuestionPageIcon;
    @FXML
    private Text QnAText;
    @FXML
    private Text Q1Text1;
    @FXML
    private Text Q1Text2;
    @FXML
    private Rectangle Rectangle;
    @FXML
    private TextField AnswerTextField;
    @FXML
    private Button NextButtonOnAdminQuestionPage;
    @FXML
    private Button BackButtonOnAdminQuestionPage;
    @FXML
    private Label WrongData;

/*
 Saves the answer for a question to a file and navigates to the MissionSuccessfull view upon completion.
 */
    public void Next(ActionEvent event) throws IOException {

        String answer = AnswerTextField.getText();

        if (answer.trim().isEmpty()) {
            WrongData.setText("Answer cannot be empty.");
        } else {
            String username = "d7";

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt"));
                writer.write("Q1 Answer for d7 (" + username + ") :\n" + answer + "\n");
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = FXMLLoader.load(getClass().getResource("MissionSuccessfull.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();


        }
    }

    /*
    Navigates back to the AdminAddSurvey view.
     */
    public void Back (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminAddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}