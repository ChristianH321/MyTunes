/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import bll.util.TimeConverter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class Playlist {
    
    private int id;
    private String name;
    private int numberOfSongs;
    private int totalLength;
    private List<Song> tracklist;
    
    /**
     * Constructs a new playlist without any songs.
     * 
     * @param id The id of playlist
     * @param name The name of playlist
     */
    
    public Playlist(int id, String name) {
        
        this.id = id;
        this.name = name;
        totalLength = 0;
        numberOfSongs = 0;
        tracklist = new ArrayList();
        
    }
    
    /**
     * Adds song to playlist.
     * 
     * @param song The song to add.
     */
    
    public void addSong(Song song) {
        
        tracklist.add(song);
        totalLength += song.getLength();
        numberOfSongs++;
        
    }
    
    /**
     * Removes song from playlist.
     * 
     * @param song The song to remove.
     */
    
    public void removeSong(Song song) {
        
        tracklist.remove(song);
        totalLength -= song.getLength();
        numberOfSongs--;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public List<Song> getTracklist() {
        return tracklist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTracklist(List<Song> tracklist) {
        this.tracklist = tracklist;
    }
    /**
     * Returns total amount of time of all songs on playlist
     * in format specified by {@ TimeConverter} class.
     * 
     * @return The formatted time.
     */
    public String getTotalLengthInString() {
        return TimeConverter.convertToString(totalLength);
    }
    
    /**
     * Returns the position of song on playlist. If
     * given song is not on playlist, returns -1.
     * 
     * @param song the Song from playlist.
     * @return The position of song on Playlist.
     */
    public int getPositionOfSong(Song song) {
        return tracklist.indexOf(song);
    }
    
    /**
     * Returns true if given song is on the playlist.
     * 
     * @param song The song to check.
     * @param true if song is on playlist.
     */
    
    public boolean isSongOnTracklist(Song song) {
        for(Song s : tracklist) {
            if(s.getId() == song.getId()) {
                return true;
            }
        }
        return false;
    }
    
    
    
}
