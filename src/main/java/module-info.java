module com.example.advanceprogrammingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.advanceprogrammingproject to javafx.fxml;
    exports com.example.advanceprogrammingproject;

    opens SurveyCreatorPage to javafx.fxml;
    exports SurveyCreatorPage;
}