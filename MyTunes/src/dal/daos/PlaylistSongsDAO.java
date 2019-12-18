/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.daos;

import be.Playlist;
import be.Song;
import java.sql.Connection;
import dal.DbConnectionProvider;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The PlaylistSongsDAO class is responsible for the operations on PlaylistSongs table in our databse.
 * @author chris
 */
public class PlaylistSongsDAO {

    private DbConnectionProvider connector;
    
    /**
     * Creates connector with database.
     */
    
    public PlaylistSongsDAO() {
        try {
            connector = new DbConnectionProvider();
        } catch (IOException ex) {
            Logger.getLogger(PlaylistSongsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public void deleteSongFromAllPlaylist(Song song) throws SQLException {
        String sqlStatement = "DELETE FROM PlaylistSongs WHERE songId=?";
        try(Connection con = connector.getConnection();
                PreparedStatement statement = con.prepareStatement(sqlStatement))
        {
            statement.setInt(1, song.getId());
            statement.execute();
        }
    }

    public void deleteSongFromPlaylist(Playlist playlist, Song song) throws SQLException {
        String sqlStatement = "DELETE FROM PlaylistSongs WHERE playlistId=? and songId=?";
        try(Connection con = connector.getConnection();
                PreparedStatement statement = con.prepareStatement(sqlStatement))
        {
            statement.setInt(1, playlist.getId());
            statement.setInt(2, song.getId());
            statement.execute();
        }
    }
    
}
