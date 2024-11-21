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

public class AfterSurveyCreatorRegistrationPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private ImageView AfterSurveyCreatorRegistrationLogo;
    @FXML private ImageView DoneIcon;
    @FXML private Text MissionText;
    @FXML private Text YouCanText;
    @FXML private Text MainPageText;
    @FXML private  Text ORText;
    @FXML private Button HomeButton;
    @FXML private Button LoginButton;

    // Method triggered upon clicking the "Home" button
    public void Home(ActionEvent event) throws IOException {
        // Load the LoginOrRegister.fxml file upon clicking the "Home" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method triggered upon clicking the "Login" button
    public void Login(ActionEvent event) throws IOException {
        // Load the SurveyCreatorLogin.fxml file upon clicking the "Login" button
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
