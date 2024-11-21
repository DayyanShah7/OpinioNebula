package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginOrRegisterPage {

    // Stage and Scene variables for managing window and scene transitions
    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements declared and injected

    @FXML private ImageView LoginOrRegisterPageLogo;
    @FXML private Text WelcomeText;
    @FXML private Text LoginText;
    @FXML private Text OrText;
    @FXML private Button BackButtonOnLoginOrRegister;
    @FXML private Button LoginButton;
    @FXML private Button RegisterButton;

    // Method to navigate to the login page
    public void Login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to navigate to the registration page
    public void Register(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorRegistration.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to navigate back to the welcome page
    public void BackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/advanceprogrammingproject/WelcomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
