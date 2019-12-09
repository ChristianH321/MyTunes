/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import be.Song;
import dal.daos.SongDAO;
import dal.daos.dalController;
import dal.daos.exceptions.Exceptions;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author chris
 */
public class BllManager {

    public static void deleteSong(Song song) throws Exceptions, Exceptions, Exceptions {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private SongDAO songs;
    
    public BllManager() throws IOException {
        songs = new SongDAO();
    }
    
    public List<Song> getAllSongs() throws Exceptions {
        return songs.getAllSongs();
    }
    
    public void deleteSong(Song song) {
        
        dalController.deleteSong(song);
    }
    
}
