package lk.ijse.orm.hostelManagementSystem.bo;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {



        private static AnchorPane pane;
        public static void navigate(lk.ijse.orm.hostelManagementSystem.bo.Routes routes, AnchorPane pane) throws IOException {
            Navigation.pane=pane;
            Navigation.pane.getChildren().clear();

            Stage window = (Stage) Navigation.pane.getScene().getWindow();

            switch(routes){
                case DASHBOARD:
                    window.setTitle("Dashboard Form");
                    initUI("DashbordForm.fxml");
                    break;

                case LOGIN:
                    window.setTitle("Login");
                    initUI("LoginForm.fxml");
                    break;
                case STUDENT:
                    window.setTitle("Student");
                    initUI("StudentForm.fxml");
                    break;
                case ROOM:
                    window.setTitle("ROOMS");
                    initUI("RoomForm.fxml");
                    break;
                case REGISTRATION:
                    window.setTitle("Registration");
                    initUI("RegistrationForm.fxml");
                    break;
                default:
                    window.setTitle("Login Form");
                    initUI("DashbordForm.fxml");
                    break;
            }
        }

        private static void initUI(String location) throws IOException {
            Navigation.pane.getChildren().add(FXMLLoader
                    .load(Navigation.class.getResource("/lk/ijse/orm/hostelManagementSystem/view/" + location)));
        }

}
