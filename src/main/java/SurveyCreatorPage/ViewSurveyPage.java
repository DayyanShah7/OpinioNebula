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

public class ViewSurveyPage {

    private Stage stage;
    private Scene scene;
    private Parent root;

    /* This section contains code for ViewSurvey.fxml */

    @FXML private ImageView ViewSurveyiconLogo;
    @FXML private ImageView ViewSurveyIcon;
    @FXML private Text ViewSurveyText;
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
    @FXML private CheckBox ViewCheckBox;

    // Method to view the selected survey
    public void View(ActionEvent event) throws IOException {
        if (ViewCheckBox.isSelected()) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/ViewSurveyforUser1.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to navigate back to AfterSurveyCreatorLogin.fxml
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /* This section contains code for ViewSurveyForUser1.fxml */

    @FXML private ImageView ViewSurveyForUser1Logo;
    @FXML private ImageView ViewSurveyForUser1Icon;
    @FXML private ImageView UserLogo;
    @FXML private ImageView OptionLogo;
    @FXML private ImageView IDLogo;
    @FXML private Text ViewSurveyForSurveyUser1Text;
    @FXML private Text UserIDText;
    @FXML private Text QuestionAnswerText;
    @FXML private Text IDText;
    @FXML private Text QuestionText1;
    @FXML private Text QuestionText2;
    @FXML private Text AnswerText1;
    @FXML private Text MakeItFreeText;
    @FXML private ListView QuestionList;
    @FXML private ListView AnswerList;
    @FXML private Button HomeButtonOnViewSurveyForUser1;
    @FXML private Button BackButtonOnViewSurveyForUser1;

    // Method to go back from ViewSurveyForUser1.fxml to ViewSurvey.fxml
    public void BackButtonOnViewSurveyForUser1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/ViewSurvey.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to go to AfterSurveyCreatorLogin.fxml from ViewSurveyForUser1.fxml
    public void HomeButtonOnViewSurveyForUser1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/AfterSurveyCreatorLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
