package com.example.advanceprogrammingproject;

/*
importing libraries
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class AdminRatingPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    /*
    control variables for admin rating page
     */
    @FXML private ImageView AdminRatingLogo;
    @FXML private ImageView AdminRatingIcon;
    @FXML private Text RatingText1;
    @FXML private Text RatingText2;
    @FXML private Text RatingQuestion1;
    @FXML private Text CorrectAnswerText;
    @FXML private TextField Q1TextField;
    @FXML private Button BackButtonOnAdminRating;
    @FXML private Button NextButtonOnAdminRating;
    @FXML private Slider Q1Slider;
    @FXML private Slider Q2Slider;


    /*
    back button redirecting to admin add survey view
     */
    public void BackButtonOnAdminRating(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("AdminAddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /*
    Records the ratings for Q1 and Q2 to a file and navigates to the MissionSuccessfull view upon completion.
     */
    public void NextButtonOnAdminRating(ActionEvent event) throws IOException {

        String username = "d7";

        int sliderValue1 = (int) Q1Slider.getValue();
        int sliderValue2 = (int) Q2Slider.getValue();

        try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt", true)) {
            writer.write("Rating Q1 Answer for " + username + ": " + sliderValue1 + "\n");
            writer.write("Rating Q2 Answer for " + username + ": " + sliderValue2 + "\n");
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





