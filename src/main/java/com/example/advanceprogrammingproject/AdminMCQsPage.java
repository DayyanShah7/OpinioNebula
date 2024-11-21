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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class AdminMCQsPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    /*
    control variables for admin mcqs
     */
    @FXML
    private ImageView AdminMCQsLogo;
    @FXML
    private ImageView AdminMCQIcon;
    @FXML
    private Text AdminMCQText;
    @FXML
    private Text Q1Text;
    @FXML
    private Text Q2Text;
    @FXML
    private Text Q2Text2;
    @FXML
    private CheckBox YesOptionQ1;
    @FXML
    private CheckBox NoOptionQ1;
    @FXML
    private CheckBox YesOptionQ2;
    @FXML
    private CheckBox NoOptionQ2;
    @FXML
    private Button BackButtonOnAdminMCQ;
    @FXML
    private Button SubmitButtonOnAdminMCQPage;
    @FXML
    private Label WrongData;

    /*
    back button redirecting to the admin add survey view
     */
    public void Back(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminAddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    private static final String FilePAth = "C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt";

/*
 Records user answers for MCQs Q1 and Q2, saves them to a file, and navigates to the MissionSuccessfull view upon completion.
 */
    public void Add(ActionEvent event) throws IOException {


        String username = "d7";

        try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt", true)) {

            writer.write(("Answer of MCQ Q1 for user (" + username + "): "));
            if (YesOptionQ1.isSelected()) {
                writer.write("Yes\n");
            } else if (NoOptionQ1.isSelected()) {
                writer.write("No\n");
            } else {
                WrongData.setText("Please answer all questions before submitting.!!");
            }

            writer.write(("Answer of MCQ Q2 for user (" + username + "): "));
            if (YesOptionQ2.isSelected()) {
                writer.write("Yes\n");
            } else if (NoOptionQ2.isSelected()) {
                writer.write("No\n");
            } else {
                WrongData.setText("Please answer all questions before submitting.");
            }


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

