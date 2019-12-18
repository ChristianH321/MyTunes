/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import be.Song;
import dal.daos.SongDAO;
import dal.daos.DalController;
import dal.daos.exceptions.Exceptions;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The BllManager class is responsible for conncetion between the GUI and the DAL
 * @author chris
 */
public class BllManager {

    
    private SongDAO songs;
    private DalController dalController;
    
    public BllManager() throws IOException {
        songs = new SongDAO();
        dalController = new DalController();
    }
    
    public List<Song> getAllSongs() throws Exceptions {
        return songs.getAllSongs();
    }
    
    public void deleteSong(Song song) {
        
        try {
            dalController.deleteSong(song);
        } catch (Exceptions ex) {
            Logger.getLogger(BllManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BllManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
