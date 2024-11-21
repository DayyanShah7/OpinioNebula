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

public class SurveyCreatorLoginPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView SurveyCreatorLoginLogo;
    @FXML private ImageView UserLoginIcon;
    @FXML private ImageView PhoneIcon;
    @FXML private ImageView EmailIcon;
    @FXML private Text UserLoginText;
    @FXML private Text UsernameText;
    @FXML private Text PasswordText;
    @FXML private Text PhoneText;
    @FXML private Text EmailText;
    @FXML private TextField UsernameField;
    @FXML private PasswordField PasswordField;
    @FXML private Button BackButton;
    @FXML private Button LoginButton;
    @FXML private Button ForgotPasswordButton;
    @FXML private Label WrongData;

    // Method to validate user login credentials
    public void Login(ActionEvent event) throws IOException {
        String username = UsernameField.getText();
        String password = PasswordField.getText();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt"))) {
            String line;
            boolean usernameFound = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    usernameFound = true;
                    break;
                }
                WrongData.setText("Login Successful"); // This line seems misplaced as it's inside the wrong scope
            }

            if (usernameFound) {
                // Redirect to AfterSurveyCreatorLogin.fxml upon successful login
                Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
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

    // Method to navigate to the SurveyCreatorForgetPassword page
    public void ForgotPassword(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorForgetPassword.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to navigate back to the LoginOrRegister page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
