package lk.ijse.orm.hostelManagementSystem.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.orm.hostelManagementSystem.bo.BOFactory;
import lk.ijse.orm.hostelManagementSystem.bo.LoginBO;

public class LoginFormController {
    public AnchorPane paneLogin;
    public TextField txtUName;
    public PasswordField txtPass;
    public Button btnLogin;
    public Button btnSignUp;
    public Label lblInvalidUN;
    public Label lblInvalidPass;

    LoginBO login = (LoginBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.LOGIN);


    public void validateUsernameOnAction(ActionEvent actionEvent) {


        String username = txtUName.getText();
        boolean checkUserName = login.checkUsername(username);
        if (checkUserName) {
            txtUName.setStyle("-fx-border-color: #01f5ff ; -fx-border-width: 2px ;");
            txtPass.requestFocus();


        } else {
            new Alert(Alert.AlertType.WARNING, "Enter Valid Username").show();
            txtUName.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
        }

    }

    public void validatePasswordOnAction(ActionEvent actionEvent) {
        String password = txtPass.getText();
        boolean isPassChecked = login.checkPassword(txtUName.getText(), password);
        if (!isPassChecked) {
            new Alert(Alert.AlertType.WARNING, "Password Did not matched").show();
            txtPass.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
        } else {
            txtPass.setStyle("-fx-border-color: #01f5ff ; -fx-border-width: 2px ;");
            btnLogin.fire();
        }
    }

    public void loginOnAction(ActionEvent actionEvent) {
        String username = txtUName.getText();
        String password = txtPass.getText();
        boolean isPassChecked = login.checkPassword(username, password);
        if (!isPassChecked) {
            new Alert(Alert.AlertType.WARNING, "Password Did not matched").show();
            txtPass.setStyle("-fx-border-color: red ; -fx-border-width: 2px ;");
        } else {
            txtPass.setStyle("-fx-border-color: #01f5ff ; -fx-border-width: 2px ;");

        }

    }


    public void usernameChanged(InputMethodEvent inputMethodEvent) {
    }

    public void passwordChanged(InputMethodEvent inputMethodEvent) {
    }

    public void colourOnMouseEnter(MouseEvent mouseEvent) {
    }
}
