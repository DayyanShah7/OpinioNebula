package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteSurveyPage {

    // Stage and Scene variables for managing window and scene transitions
    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements declared and injected

    @FXML private ImageView DeleteSurveyIconLogo;
    @FXML private ImageView DeleteSurveyIcon;
    @FXML private Text DeleteSurveyText;
    @FXML private Text SurveyIDText;
    @FXML private Text SurveyCreatedByText;
    @FXML private Text ds7Text;
    @FXML private Text IDValueText;
    @FXML private Text QnAText;
    @FXML private Text SurveyTypeText;
    @FXML private Button BackButton;
    @FXML private ListView MainList;
    @FXML private ListView SurveyCreatedByList;
    @FXML private ListView SurveyIDList;
    @FXML private CheckBox DeleteCheckBox;

    // Method for navigating back to the previous page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to initiate the deletion process
    public void Delete(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/DeleteSurveyUser1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to confirm the successful deletion of a survey
    public void Delete2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/SurveyDeleted.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // ... (additional methods related to the DeleteSurveyPage)

    // Method for navigating back to the view survey page
    public void BackButtonOnDeleteSurveyForUser1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/ViewSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to confirm the deletion of a survey
    public void DeleteButtonOnDeleteSurveyUser1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/DeleteSurveyConfirm.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method for navigating back to the main page after confirming deletion
    public void HomeButtonOnDeleteSurveyConfirm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
