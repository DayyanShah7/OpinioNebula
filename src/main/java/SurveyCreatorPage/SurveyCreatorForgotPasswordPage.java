package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SurveyCreatorForgotPasswordPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView SurveyCreatorForgotPasswordLogo;
    @FXML private ImageView ForgotPasswordIcon;
    @FXML private Text UsernameText;
    @FXML private Text SearchText;
    @FXML private TextField UsernameField;
    @FXML private Button BackButton;
    @FXML private Button SearchButton;
    @FXML private Label WrongData;

    // Method to navigate back to the SurveyCreatorLogin page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to search for username and determine password reset
    public void Search(ActionEvent event) throws IOException {
        String username = UsernameField.getText();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt"))) {
            String line;
            boolean loggedIn = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (username.equals(storedUsername)) {
                    loggedIn = true;
                    break;
                }
                WrongData.setText("Successful Login"); // This line seems misplaced as it's inside the wrong scope
            }

            if (loggedIn) {
                // Redirect to SurveyCreatorPasswordReset.fxml upon successful login
                Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorPasswordReset.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                WrongData.setText("Incorrect Details. Please Try Again");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to navigate to the LoginOrRegister page after successful password reset
    @FXML private ImageView PasswordResetSuccessfullyLogo;
    @FXML private ImageView PasswordIcon;
    @FXML private ImageView DoneIcon;
    @FXML private Text PasswordResetSuccessfully;
    @FXML private Button LoginButton;

    public void Login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
