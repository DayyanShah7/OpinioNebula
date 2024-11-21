package com.example.advanceprogrammingproject;

/*
importing libraries
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //StartPage Controls
    @FXML private ImageView StartPageLogo;

    //WelcomePage Controls
    @FXML private ImageView WelcomePageLogo;
    @FXML private ImageView AdminIcon;
    @FXML private ImageView UserIcon;
    @FXML private Text WelcomeText;
    @FXML private Text UserText;
    @FXML private Text LoginText;
    @FXML private Text OrText;
    @FXML private Button UserGuideButton;
    @FXML private Button AboutUsButton;
    @FXML private Button UserButton;
    @FXML private Button AdminButton;

    //AboutUs Page Controls
    @FXML private ImageView AboutUsPageLogo;
    @FXML private ImageView AboutUsLogo;
    @FXML private ImageView PhoneIcon;
    @FXML private ImageView EmailIcon;
    @FXML private Text AboutUsText;
    @FXML private Text NumberText;
    @FXML private Text EmailText;
    @FXML private Text AboutUsIntroText;
    @FXML private Button BackButtonOnAboutUs;


    //UserGuide Page Controls
    @FXML private ImageView UserGuidePageLogo;
    @FXML private ImageView UserGuideIcon;
    @FXML private ImageView PhoneIconUserGuide;
    @FXML private ImageView EmailIconUserGuide;
    @FXML private Text UserGuideText;
    @FXML private Text EmailTextUserGuide;
    @FXML private Text NumberTextUserGuide;
    @FXML private Text UserGuideIntroText;
    @FXML private Button BackButtonOnUserGuide;





    //Directs to Admin Login Page. Where Admin can Login
    public void ToAdminLoginPage (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //Directs to User Login Page, where user can login.
    public void ToUserLoginPage (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/SurveyCreatorfxml/LoginOrRegister.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //This is the About Us Button on Welcome Page,when clicked this will take user to About Us Page.
    public void ToAboutUs (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //This is the User Guide Button on Welcome Page,when clicked this will take user to User Guide Page.
    public void ToUserGuide (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("UserGuide.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //This is the Back Button on About Us  Page.When clicked this will take user back to Welcome Page.
    public void BackonAboutUs (ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //This is the Back Button on User Guide Page.When clicked this will take user back to Welcome Page.
    public void BackonUserGuide (ActionEvent event ) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

//Conttoller.java is the file which is the controller for Welcome, Start, User Guide and About Us pages.
//All the button on these pages are controlled from the code on controller.java file