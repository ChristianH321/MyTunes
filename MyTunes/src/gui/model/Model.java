/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.model;

import be.Playlist;
import be.Song;
import bll.BllManager;
import dal.daos.exceptions.Exceptions;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author chris
 */
public class Model {
    
    private ObservableList<Song> songList;
    private BllManager manager;
    
    public Model () throws IOException, Exceptions {
        songList = FXCollections.observableArrayList();
        manager = new BllManager();
        songList.addAll(manager.getAllSongs());
    }
    

    public ObservableList<Song> getAllSongs() {
        return songList;
    }
    
    
    
}

