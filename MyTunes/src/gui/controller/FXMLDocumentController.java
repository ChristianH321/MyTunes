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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author chris
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<?> songsOnPlaylistList;
    @FXML
    private ListView<?> songList;
    @FXML
    private ImageView btnPlaySong;
    @FXML
    private ImageView btnPreviousSong;
    @FXML
    private ImageView btnNextSong;
    @FXML
    private ImageView btnSoundOnAndOff;
    @FXML
    private Slider sliderVolume;
    @FXML
    private ListView<?> playLists;
    @FXML
    private Button btnCloseProgram;
    @FXML
    private Button btnNewPlaylist;
    @FXML
    private Button btnEditPlaylist;
    @FXML
    private Button btnDeletePlaylist;
    @FXML
    private Button btnDeleteSong;
    @FXML
    private Button btnEditSong;
    @FXML
    private Button btnAddNewSong;
    @FXML
    private Button btnDeleteSongsOnPlaylist;
    @FXML
    private ImageView btnMoveSongtoPlaylist;
    @FXML
    private ImageView btnMoveSongUp;
    @FXML
    private ImageView btnMoveSongDown;
    @FXML
    private TextField btnSearchField;
    @FXML
    private ImageView btnSearch;
    @FXML
    private ImageView btnExitWindow;
    @FXML
    private ImageView btnMaximize;
    @FXML
    private ImageView btnMinimize;
    @FXML
    private TextField fieldDisplaySong;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Space(KeyEvent event) {
    }
    @FXML
    private void Searching(ActionEvent event) {
    }
    @FXML
    private void displaysSong(ActionEvent event) {
    }

    @FXML
    private void clickPlay(MouseEvent event) {   
    }

    @FXML
    private void clickPreviousSong(MouseEvent event) {
    }

    @FXML
    private void clickNextSong(MouseEvent event) {       
    }

    @FXML
    private void clickSoundOnAndOff(MouseEvent event) {
    }

    @FXML
    private void dragVolume(MouseEvent event) {
    }

    @FXML
    private void clickClosingProgram(MouseEvent event) {
    }

    @FXML
    private void closesProgram(ActionEvent event) {
    }

    @FXML
    private void clickNewPlaylist(MouseEvent event) {
    }

    @FXML
    private void opensNewEditWindow(ActionEvent event) {
    }

    @FXML
    private void clickEditPlaylist(MouseEvent event) {
    }

    @FXML
    private void editsPlaylist(ActionEvent event) {
    }

    @FXML
    private void clickDeletePlaylist(MouseEvent event) {
    }

    @FXML
    private void deletesPlaylist(ActionEvent event) {
    }

    @FXML
    private void clickDeletesSong(MouseEvent event) {
    }

    @FXML
    private void deletesSong(ActionEvent event) {
    }

    @FXML
    private void clickEditsSongs(MouseEvent event) {
    }

    @FXML
    private void editsSong(ActionEvent event) {
    }

    @FXML
    private void clickAddsSong(MouseEvent event) {
    }

    @FXML
    private void addsSong(ActionEvent event) {
    }

    @FXML
    private void clickDeleteSongsOnPlaylist(MouseEvent event) {
    }

    @FXML
    private void deletesSongsOnPlaylist(ActionEvent event) {
    }

    @FXML
    private void clickAddSongToPlaylist(MouseEvent event) {
    }

    @FXML
    private void clickMoveSongUp(MouseEvent event) {
    }

    @FXML
    private void clickMoveSongDown(MouseEvent event) {
    }

    @FXML
    private void releaseClear(MouseEvent event) {
    }

    @FXML
    private void clickFilterActive(MouseEvent event) {
    }

    @FXML
    private void clickSearch(MouseEvent event) {
    }

    @FXML
    private void clickExitWindow(MouseEvent event) {
    }

    @FXML
    private void clickMaximize(MouseEvent event) {
    }

    @FXML
    private void clickMinimize(MouseEvent event) {
    }
    
}
