package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class SurveyCreatorPasswordResetPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView SurveyCreatorPasswordResetLogo;
    @FXML private ImageView PasswordResetIcon;
    @FXML private Text PasswordResetText;
    @FXML private Text NewPasswordText;
    @FXML private Text PasswordText;
    @FXML private Text ConfirmPasswordText;
    @FXML private TextField PasswordField;
    @FXML private TextField ConfirmPasswordField;
    @FXML private Button BackButton;
    @FXML private Button ResetPasswordButton;

    // Method to navigate back to the SurveyCreatorForgetPassword page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorForgetPassword.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to reset the user's password
    public void ResetPassword(ActionEvent event) throws IOException {
        String username = "ds7"; // Sample username
        String password = PasswordField.getText();

        if (!username.isEmpty() && !password.isEmpty()) {
            try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt", true)) {
                writer.write(username + "," + password + "," + "\n");
                writer.flush();
                writer.close();

                // Redirect to PasswordResetSuccessfull.fxml upon successful password reset
                Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/PasswordResetSuccessfull.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Controls for the PasswordResetSuccessfull.fxml file
    @FXML private ImageView SurveyCreatorPasswordResetSuccessfullyLogo;
    @FXML private ImageView SurveyCreatorPasswordResetSuccessfullyIcon;
    @FXML private ImageView DoneIcon;
    @FXML private Text SurveyCreatorPasswordResetSuccessfullyLogoText;
    @FXML private Button LoginButton;

    // Method to navigate to the LoginOrRegister page
    public void Login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
