package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class RatingPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView RatingLogo;
    @FXML private ImageView RatingIcon;
    @FXML private Text RatingText1;
    @FXML private Text RatingText2;
    @FXML private Text RatingQuestion1;
    @FXML private Text CorrectAnswerText;
    @FXML private TextField Q1TextField;
    @FXML private Button BackButton;
    @FXML private Button SubmitButton;
    @FXML private Slider Q1Slider;
    @FXML private Slider Q2Slider;

    // Method to navigate back to the AddSurvey page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to submit the rating answers and write to a file
    public void Submit(ActionEvent event) throws IOException {
        String username = "d7";

        int sliderValue1 = (int) Q1Slider.getValue();
        int sliderValue2 = (int) Q2Slider.getValue();

        try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt", true)) {
            // Writing rating answers to a file
            writer.write("Rating Q1 Answer for " + username + ": " + sliderValue1 + "\n");
            writer.write("Rating Q2 Answer for " + username + ": " + sliderValue2 + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Navigating to the ThankYou page after submitting
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/ThankYou.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
