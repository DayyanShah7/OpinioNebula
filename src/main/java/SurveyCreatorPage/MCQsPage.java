package SurveyCreatorPage;

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

public class MCQsPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView MCQsLogo;
    @FXML private ImageView MCQIcon;
    @FXML private Text MCQText;
    @FXML private Text Q1Text;
    @FXML private Text Q2Text;
    @FXML private Text Q2Text2;
    @FXML private CheckBox YesOptionQ1;
    @FXML private CheckBox NoOptionQ1;
    @FXML private CheckBox YesOptionQ2;
    @FXML private CheckBox NoOptionQ2;
    @FXML private Button BackButton;
    @FXML private Button SubmitButton;
    @FXML private Label WrongData;

    // Method to navigate back to the AddSurvey page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AddSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // File path to save the survey answers
    private static final String FilePath = "C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\SurveyAnswer.txt";

    // Method to submit survey answers
    public void Submit(ActionEvent event) throws IOException {
        String username = "d7";

        try (FileWriter writer = new FileWriter(FilePath, true)) {
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

        // Navigating to the ThankYou page after submitting
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/ThankYou.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
