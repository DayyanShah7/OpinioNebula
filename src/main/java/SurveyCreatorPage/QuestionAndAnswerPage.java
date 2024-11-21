package SurveyCreatorPage;

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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionAndAnswerPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView QuestionAndAnswerLogo;
    @FXML private ImageView QuestionAndAnswerIcon;
    @FXML private Text QnAText;
    @FXML private Text Q1Text1;
    @FXML private Text Q1Text2;
    @FXML private TextField AnswerTextField;
    @FXML private Button BackButton;
    @FXML private Button NextButton;
    @FXML private Label WrongData;

    // Method to navigate back to the AddSurvey page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle submission and write the answer to a file
    public void Next(ActionEvent event) throws IOException {
        String answer = AnswerTextField.getText();

        if (answer.trim().isEmpty()) {
            WrongData.setText("Answer cannot be empty.");
        } else {
            String username = "d7";

            try {
                // Writing the answer to a file
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt"));
                writer.write("Q1 Answer for d7 (" + username + ") :\n" + answer + "\n");
                writer.close();

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
}
