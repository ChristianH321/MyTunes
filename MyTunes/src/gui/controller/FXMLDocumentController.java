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
    private ImageView playButton;
    @FXML
    private ImageView previousSongButton;
    @FXML
    private ImageView nextSongButton;
    @FXML
    private ImageView soundOnAndOff;
    @FXML
    private Slider Volume;
    @FXML
    private ListView<?> playlistList;
    @FXML
    private ListView<?> songsOnPlaylistList;
    @FXML
    private ListView<?> songList;
    @FXML
    private ImageView addSongToPlaylist;
    @FXML
    private ImageView movesSongUp;
    @FXML
    private ImageView movesSongDown;
    @FXML
    private TextField searchField;
    @FXML
    private ImageView searchButton;
    @FXML
    private ImageView shutDownButton;
    @FXML
    private ImageView maximizeButton;
    @FXML
    private ImageView minimizeButton;
    @FXML
    private TextField displaysSongPlaying;
    
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
    private void Play(MouseEvent event) {
    }

    @FXML
    private void previousSong(MouseEvent event) {
    }

    @FXML
    private void nextSong(MouseEvent event) {
    }

    @FXML
    private void soundOnAndOff(MouseEvent event) {
    }

    @FXML
    private void addsSongToPlaylist(MouseEvent event) {
    }

    @FXML
    private void movesSongUp(MouseEvent event) {
    }

    @FXML
    private void movesSongDown(MouseEvent event) {
    }

    @FXML
    private void clearButton(MouseEvent event) {
    }

    @FXML
    private void Searching(ActionEvent event) {
    }

    @FXML
    private void filterActive(MouseEvent event) {
    }

    @FXML
    private void search(MouseEvent event) {
    }

    @FXML
    private void shutsDown(MouseEvent event) {
    }

    @FXML
    private void maximizes(MouseEvent event) {
    }

    @FXML
    private void minimizes(MouseEvent event) {
    }

    @FXML
    private void displaysSong(ActionEvent event) {
    }
    
}
