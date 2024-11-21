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
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SurveyDeletedPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView SurveyDeletedLogo;
    @FXML private ImageView SurveyDeletedIcon;
    @FXML private Text SurveyDeletedText;
    @FXML private Text SurveyIDText;
    @FXML private Text SurveyCreatedByText;
    @FXML private Text SurveyTypeText;
    @FXML private Button BackButton;
    @FXML private Button DeleteButton;
    @FXML private ListView MainList;
    @FXML private ListView SurveyCreatedByList;
    @FXML private ListView SurveyIDList;
    @FXML private CheckBox DeleteCheckBox;
    @FXML private Label WrongData;

    // Method to navigate back to AfterSurveyCreatorLogin page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method triggered on delete action
    public void Delete(ActionEvent event) throws IOException {
        WrongData.setText("No existing Survey."); // Update label to show no existing survey
    }
}
