package controller;

import java.io.IOException;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Session;


public class SessionController extends Controller<Session> {


    @FXML
    private Button loginButton;

    @FXML
    private Button exitButton;

    @FXML
    private void handleLoginButton() throws IOException {
        ViewLoader.showStage(model, "/view/MMSlogin.fxml", "Login", new Stage());
    }

    @FXML
    private void handleExitButton() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}