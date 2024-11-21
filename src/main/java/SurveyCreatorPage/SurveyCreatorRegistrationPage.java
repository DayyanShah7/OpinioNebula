package SurveyCreatorPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

public class SurveyCreatorRegistrationPage implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    // FXML elements injected
    @FXML private ImageView SurveyCreatorRegistrationPageLogo;
    @FXML private ImageView AddUserIcon;
    @FXML private Text UserRegsitartionText;
    @FXML private Text NameText;
    @FXML private Text UsernameText;
    @FXML private Text StudentIDText;
    @FXML private Text EmailText;
    @FXML private Text PasswordText;
    @FXML private Text GenderText;
    @FXML private TextField NameField;
    @FXML private TextField UsernameField;
    @FXML private TextField StudentIDField;
    @FXML private TextField EmailField;
    @FXML private PasswordField PasswordField;
    @FXML private Button BackButton;
    @FXML private Button RegistrationButton;
    @FXML private ChoiceBox<String> GenderBox;
    @FXML private Label WrongData;

    // Gender list for ChoiceBox
    private String[] GenderList = {"Male", "Female", "Anything in Between"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Populate GenderBox with GenderList items
        GenderBox.getItems().addAll(GenderList);
    }

    // Method to navigate back to LoginOrRegister page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Method to register a new user
    public void Register(ActionEvent event) throws IOException {
        String name = NameField.getText();
        String username = UsernameField.getText();
        String studentID = StudentIDField.getText();
        String email = EmailField.getText();
        String password = PasswordField.getText();
        String gender = GenderBox.getValue();

        if (!name.isEmpty() && !password.isEmpty()) {
            // Hash password for storage
            String hashPassword = hashPassword(password);

            try (FileWriter writer = new FileWriter("C:\\Users\\dayya\\IdeaProjects\\AdvanceProgrammingProject\\user.txt", true)) {
                writer.write(username + "," + password + "\n");
                writer.flush();
                writer.close();

                // Redirect to UserRegisteredSuccessfully.fxml upon successful registration
                Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/UserRegisteredSuccessfully.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (NameField.getText().isEmpty() || UsernameField.getText().isEmpty() || EmailField.getText().isEmpty() || StudentIDField.getText().isEmpty() || PasswordField.getText().isEmpty()) {
            WrongData.setText("Text cannot be left Blank");
        }
    }

    // Method to hash password using SHA-256 algorithm
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);

            StringBuilder hashText = new StringBuilder(no.toString(16));
            while (hashText.length() < 32) {
                hashText.insert(0, "0");
            }

            return hashText.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
