package SurveyCreatorPage;

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

public class AddSurveyPage {

    // Stage and Scene variables for managing window and scene transitions
    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements declared and injected
    @FXML private ImageView AddSurveyLogo;
    @FXML private ImageView AddSurveyIcon;
    @FXML private Text WelcomeUserText;
    @FXML private Text PleaseText;
    @FXML private Text ToCreateText;
    @FXML private Button BackButton;
    @FXML private Button ContinueButton;
    @FXML private ComboBox<String> ComboBox;

    // Initialization method invoked when the FXML is loaded
    public void initialize() {
        // The ComboBox options are initialized here, so the user can choose among them.
        ComboBox.getItems().addAll("Question And Answer", "MCQs", "Rate out of 5");
    }

    // Method triggered upon clicking the "Continue" button
    public void Continue(ActionEvent event) throws IOException {
        // Retrieve selected ComboBox option
        String selectedOption = ComboBox.getValue();

        if (selectedOption != null) {
            String FXMLFile;
            // Determine the appropriate FXML file based on the selected ComboBox option
            switch (selectedOption) {
                case "Question And Answer":
                    FXMLFile = "/SurveyCreatorfxml/QuestionAndAnswer.fxml";
                    break;
                case "MCQs":
                    FXMLFile = "/SurveyCreatorfxml/MCQs.fxml";
                    break;
                default:
                    FXMLFile = "/SurveyCreatorfxml/Rating.fxml";
                    break;
            }
            // Load the chosen FXML file and set the scene for transition
            Parent root = FXMLLoader.load(getClass().getResource(FXMLFile));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    // Method triggered upon clicking the "Back" button
    public void Back(ActionEvent event) throws IOException {
        // Navigate back to the previous FXML file upon clicking the "Back" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
