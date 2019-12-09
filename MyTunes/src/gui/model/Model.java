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
    private ObservableList<Playlist> songsOnPlaylistList;
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
        
        BllManager.deleteSong(song);
        deleteSongFromAllPlaylist(song);
        songList.remove(song);
    }

    private void deleteSongFromAllPlaylist(Song song) {
        
        for(int i = 0; i < songsOnPlaylistList.size(); i++) {
            
            for (int j = 0; j < songsOnPlaylistList.get(i).getTracklist().size(); j++) {
                
                if(song.getId() == songsOnPlaylistList.get(i).getTracklist().get(j).getId()) {
                    
                    songsOnPlaylistList.get(i).removeSong(songsOnPlaylistList.get(i).getTracklist().get(j));
                    updateListOfPlaylist(songsOnPlaylistList.get(i));
                }
            }
        }
    }

    private void updateListOfPlaylist(Playlist playlist) {
        
        int index = songsOnPlaylistList.indexOf(playlist);
        songsOnPlaylistList.set(index, playlist);
        setPlaylistSongs(playlist);
        
    }

    private void setPlaylistSongs(Playlist playlist) {
        
       songsOnPlaylistList.setAll(playlist.getTracklist());
        
    }
    
    
    
}

