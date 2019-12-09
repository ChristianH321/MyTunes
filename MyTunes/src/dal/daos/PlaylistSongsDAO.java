/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.daos;

import be.Playlist;
import be.Song;
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author chris
 */
public class PlaylistSongsDAO {

    public void deleteSongFromAllPlaylist(Song song) {
        String sqlStatement = "DELETE FROM PlaylistSongs WHERE songId=?";
        try(Connection con = connector.getConnection();
                PreparedStatement statement = con.prepareStatement(sqlStatement))
        {
            statement.setInt(1, song.getId());
            statement.execute();
        }
    }

    public void deleteSongFromPlaylist(Playlist playlist, Song song) {
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
