/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.daos;

import be.Playlist;
import be.Song;
import dal.daos.exceptions.Exceptions;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class dalController {
    
    private SongDAO songDao;
    private PlaylistDAO playlistDao;
    private PlaylistSongsDAO playlistSongsDao;
    
    
    public void deleteSong(Song song) throws Exceptions, SQLException {
        
        songDao.deleteSong(song);
    }
    
    public void deleteSongFromPlaylist(Playlist playlist, Song song) {
        
        try
        {
            playlistSongsDao.deleteSongFromPlaylist(playlist, song);
           
        }
        catch(SQLException e)
        {
            
        }
    }
}
