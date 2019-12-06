/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.daos;

import be.Song;
import dal.DbConnectionProvider;
import dal.daos.exceptions.Exceptions;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class SongDAO {
    
    private final DbConnectionProvider connectionPool;

    public SongDAO() throws IOException
    {
        connectionPool = new DbConnectionProvider();
    }

    public Song createSong (String title, String artist, String category, int length, String path) throws Exceptions
    {
        String sql = "INSERT INTO Songs (title, artist, category, length, path) VALUES(?,?);";
         // <<< Using the object pool here <<<
        try (Connection con = connectionPool.getConnection())
        {
            PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, title);
            st.setString(2, artist);
            st.setString(3, category);
            st.setInt(4, length);
            st.setString(5, path);
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            int id = 0;
            if (rs.next())
            {
                id = rs.getInt(1);
            }
            Song song = new Song (id, title, artist, category, length, path);
            return song;
        } catch (SQLException ex)
        {
            throw new Exceptions("Could not create song.", ex);
        }
    }

    
    public void deleteSong (Song song) throws Exceptions
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Song> getAllSongs() throws Exceptions
    {
        List<Song> songs = new ArrayList<>();
        
        try (Connection con = connectionPool.getConnection())
        {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM Songs;");
            while (rs.next())
            {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String artist = rs.getString("artist");
                String category = rs.getString("category");
                int length = rs.getInt("length");
                String path = rs.getString("path");
                Song song = new Song (id, title, artist, category, length, path);
                songs.add(song);
            }
            return songs;
        } catch (SQLException ex)
        {
            throw new Exceptions("Could not get all songs from database", ex);
        } 
    }

    
    public Song getSong(int id) throws Exceptions
    {
        return null;
    }

    
    public void updateSong(Song song) throws Exceptions
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
