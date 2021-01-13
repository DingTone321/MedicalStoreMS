package main_view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Main_View_Controller  {
    public BorderPane allView;
    @FXML

    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void dashboard(ActionEvent actionEvent) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/module1/Dashboard.fxml"));
        allView.setCenter(pane);
    }

    public void Medicine(ActionEvent actionEvent) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("/module2/Medicines.fxml"));
        allView.setCenter(pane);
    }



    public void Purchase(ActionEvent actionEvent) throws IOException {
        Parent layout = FXMLLoader.load(getClass().getResource("/module4/Purchase.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(layout));
        stage.setMaximized(true);
        stage.setTitle("Purchase");
        stage.show();
    }
}