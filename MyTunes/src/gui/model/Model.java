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
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author chris
 */
public class Model {
    
    private ObservableList<Song> songList;
    private ObservableList<Playlist> PlaylistList;
    private BllManager manager;
    private ObservableList<Song> playlistSongs;
    
    public Model () throws IOException, Exceptions {
        songList = FXCollections.observableArrayList();
        manager = new BllManager();
        songList.addAll(manager.getAllSongs());
        playlistSongs = FXCollections.observableArrayList();
        
    }
    

    public ObservableList<Song> getAllSongs() {
        return songList;
    }
    
    public void deleteSong(Song song) throws Exceptions {
        
        manager.deleteSong(song);
        deleteSongFromAllPlaylist(song);
        songList.remove(song);
    }

    private void deleteSongFromAllPlaylist(Song song) {
        
   
    }

    private void updateListOfPlaylist(Playlist playlist) {
        
        int index = PlaylistList.indexOf(playlist);
        PlaylistList.set(index, playlist);
        setPlaylistSongs(playlist);
        
    }

    private void setPlaylistSongs(Playlist playlist) {
        
       playlistSongs.setAll(playlist.getTracklist());
        
    }
    
    
    
    
}

