package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TVDemoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Person> tvData;

    @FXML
    private TableColumn<String, Person> column1;

    @FXML
    private TableColumn<String, Person> column2;

    @FXML
    private Button btnLoad;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnSortByFirstName;

    @FXML
    private Button btnSortByLastName;

    @FXML
    void buttonClearPressed(ActionEvent event) {
        tvData.getItems().clear();
    }

    @FXML
    void loadButtonPressed(ActionEvent event) {
        tvData.getItems().add(new Person("John", "Doe"));
        tvData.getItems().add(new Person("Jane", "Deer"));
        tvData.getItems().add(new Person("Maska", "Zorro"));
    }

    @FXML
    void sortByFirstNamePressed(ActionEvent event) {

    }

    @FXML
    void sortByLastNamePressed(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tvData != null : "fx:id=\"tvData\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert column1 != null : "fx:id=\"column1\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert column2 != null : "fx:id=\"column2\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnLoad != null : "fx:id=\"btnLoad\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnSortByFirstName != null : "fx:id=\"btnSortByFirstName\" was not injected: check your FXML file 'tvdemo.fxml'.";
        assert btnSortByLastName != null : "fx:id=\"btnSortByLastName\" was not injected: check your FXML file 'tvdemo.fxml'.";


        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));//nazwa pola klasy Person
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    }
}
