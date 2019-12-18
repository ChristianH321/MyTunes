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
 * This class is responsible for 
 * getting and passing all informations about playlist and songs
 * to the BLL. It is using singleton design pattern. 
 * Its main responsibility is also storing temporary state of data with all 
 * songs and all playlists and list with songs on currently selected playlist on view.
 * It also consist of all the informations that are reflecting state of the
 * FXMLDocumentController.java.
 * @author chris
 */
public class Model {
    
    private ObservableList<Song> songList;
    private ObservableList<Playlist> PlaylistList;
    private BllManager manager;
    private ObservableList<Song> playlistSongs;
    
    /**
     * Creats a connection with the BLL, gets data and initial values.
     * @throws IOException
     * @throws Exceptions 
     */
    
    public Model () throws IOException, Exceptions {
        songList = FXCollections.observableArrayList();
        manager = new BllManager();
        songList.addAll(manager.getAllSongs());
        playlistSongs = FXCollections.observableArrayList();
        
    }
    
    /*
    The purpose of this method is to get all the songs.
    And it returns the SongList.
    */

    public ObservableList<Song> getAllSongs() {
        return songList;
    }
    
    
    /*
    The purpose of this method is to delete the selected song in the song list.
    */
    
    public void deleteSong(Song song) throws Exceptions {
        
        manager.deleteSong(song);
        deleteSongFromAllPlaylist(song);
        songList.remove(song);
    }
    
    /*
    The purpose of this method is to delete the selected song from all playlists.
    */
    
    private void deleteSongFromAllPlaylist(Song song) {
        
   
    }

    /*
    The purpose of this method is to update the playlist.
    */
    
    private void updateListOfPlaylist(Playlist playlist) {
        
        int index = PlaylistList.indexOf(playlist);
        PlaylistList.set(index, playlist);
        setPlaylistSongs(playlist);
        
    }

    /*
    The purpose of this method is to set songs into the playlist.
    */
    
    private void setPlaylistSongs(Playlist playlist) {
        
       playlistSongs.setAll(playlist.getTracklist());
        
    }
    
    
    
    
}

