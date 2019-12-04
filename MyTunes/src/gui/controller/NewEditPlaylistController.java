/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class NewEditPlaylistController implements Initializable {

    @FXML
    private TextField fieldForNamingPlaylist;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnSaveNewPlaylist;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickToTypeName(MouseEvent event) {
    }

    @FXML
    private void writeNameOfPlaylist(ActionEvent event) {
    }

    @FXML
    private void clickCancelToAddNewPlaylist(MouseEvent event) {
    }

    @FXML
    private void cancelsAddingNewPlaylist(ActionEvent event) {
    }

    @FXML
    private void clickSaveNewPlaylist(MouseEvent event) {
    }

    @FXML
    private void savesNewPlaylist(ActionEvent event) {
    }
    
}
