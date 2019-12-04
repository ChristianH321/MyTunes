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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author tiene
 */
public class NewEditSongController implements Initializable {

    @FXML
    private ComboBox<?> btnDragDownCategories;
    @FXML
    private TextField fieldForEditingSongTitle;
    @FXML
    private TextField FieldForEditingArtist;
    @FXML
    private TextField FieldEditingLengthOfSong;
    @FXML
    private TextField FieldToDisplayFilePath;
    @FXML
    private Button btnShowListOfCategories;
    @FXML
    private Button btnSaveSong;
    @FXML
    private Button btnCancelEditSong;
    @FXML
    private Button fileChooser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickDragsDown(MouseEvent event) {
    }

    @FXML
    private void dragsDownCategories(ActionEvent event) {
    }

    @FXML
    private void clickToEditSongTitle(MouseEvent event) {
    }

    @FXML
    private void editsSongTitle(ActionEvent event) {
    }

    @FXML
    private void clickEditArtistName(MouseEvent event) {
    }

    @FXML
    private void editsArtistName(ActionEvent event) {
    }

    @FXML
    private void clickEditLengthOfSong(MouseEvent event) {
    }

    @FXML
    private void editsLengthOfSong(ActionEvent event) {
    }

    @FXML
    private void displaysFilePath(ActionEvent event) {
    }

    @FXML
    private void clickDisplayMoreCategories(MouseEvent event) {
    }

    @FXML
    private void displaysMoreCategories(ActionEvent event) {
    }

    @FXML
    private void clickSaveSong(MouseEvent event) {
    }

    @FXML
    private void savesSong(ActionEvent event) {
    }

    @FXML
    private void clickCancelEditSong(MouseEvent event) {
    }

    @FXML
    private void cancelsEditSong(ActionEvent event) {
    }

    @FXML
    private void clickToOpenWindowToChooseFile(MouseEvent event) {
    }

    @FXML
    private void choosesSongFiles(ActionEvent event) {
    }
    
}
