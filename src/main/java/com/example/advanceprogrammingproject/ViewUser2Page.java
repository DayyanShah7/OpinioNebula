package com.example.advanceprogrammingproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewUser2Page implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private ImageView ViewUser2Logo;
    @FXML private ImageView ViewUser2Icon;
    @FXML private Text ViewUserText2;
    @FXML private Button BackButton;
    @FXML private TableView<Person> table;
    @FXML private TableColumn<Person, String> DOBC;

    // Method to handle navigating back to the UserManagement page
    public void Back(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserManagement.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize table columns
        TableColumn<Person, String> NameC = new TableColumn("Name");
        TableColumn<Person, String> StudentIDC = new TableColumn("StudentD");
        TableColumn<Person, String> UsernameC = new TableColumn("Username");
        TableColumn<Person, String> EmailC = new TableColumn("Email");
        TableColumn<Person, String> GenderC = new TableColumn("Gender");

        // Add table columns to the TableView
        table.getColumns().addAll(NameC, StudentIDC, UsernameC, EmailC, GenderC);

        // Populate data in the table
        final ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("Dayyan", "007", "Dayyan_7", "dayyan@gmail.com", "Male"),
                new Person("Neymar", "100", "NeyJR", "Samba@yahoo.com", "Female")
        );

        // Set cell value factories for each column
        NameC.setCellValueFactory(new PropertyValueFactory<>("name"));
        StudentIDC.setCellValueFactory(new PropertyValueFactory<>("id"));
        UsernameC.setCellValueFactory(new PropertyValueFactory<>("username"));
        EmailC.setCellValueFactory(new PropertyValueFactory<>("email"));
        GenderC.setCellValueFactory(new PropertyValueFactory<>("gender"));

        // Set the data into the table
        table.setItems(data);
    }
}
