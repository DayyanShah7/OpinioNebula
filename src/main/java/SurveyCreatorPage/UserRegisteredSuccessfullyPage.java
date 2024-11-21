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

public class UserRegisteredSuccessfullyPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView UserRegisteredSuccessfullyLogo;
    @FXML private ImageView UserIcon;
    @FXML private ImageView DoneIcon;
    @FXML private Text UserText;
    @FXML private Button HomeButton;
    @FXML private Button LoginButton;

    // Method to navigate to WelcomePage
    public void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/advanceprogrammingproject/WelcomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to navigate to LoginOrRegister page
    public void Login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
