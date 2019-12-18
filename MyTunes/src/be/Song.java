/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

import bll.util.TimeConverter;

/**
 *
 * @author chris
 */
public class Song {
    
    private int id;
    private String title;
    private String artist;
    private String category;
    private int length;
    private String path;
    
    /**
     * Constructs a new song
     * 
     * @param id the ID of the song
     * @param title the title of the song
     * @param artist the artist of the song
     * @param category the genre of the song
     * @param length the length of the song
     * @param path the path of the song
     */
    
    public Song(int id, String title, String artist, String category, int length, String path) {
        
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.category = category;
        this.length = length;
        this.path = path;
        
    }
     /*
     Returns ID of the song.
     @return the id of the song
    */
    public int getId() {
        return id;
    }
    
/*
     Returns title of the song.
     @return the title of the song
    */
    
    public String getTitle() {
        return title;
    }

    /*
     Sets the title of the song.
     @param the title of the song
    */
    
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     Returns artist of the song.
     @return the artist of the song
    */
    
    public String getArtist() {
        return artist;
    }

    /*
     Sets artist of the song.
     @param artist The artist to set.
    */
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /*
     Returns category of the song.
     @return the category of the song
    */
    
    public String getCategory() {
        return category;
    }

    /*
     Sets category of the song
     @param category The category to set.
    */
    
    public void setCategory(String category) {
        this.category = category;
    }

    /*
     Returns length of the song.
     @return the length of the song
    */
    
    public int getLength() {
        return length;
    }
    
    /*
     Returns the path of the song.
     @return The path to song.
    */
    
    public String getPath() {
        return path;
    }

    /*
     Sets path of the song.
     @param path The path to set.
    */
    
    public void setPath(String path) {
        this.path = path;
    }
    /**
     * Returns in format specified by {@code TimeConverter} class.
     * 
     * @return The formatted time.
     */
    public String getLengthInString() {
        return TimeConverter.convertToString(length);
    }
    
    @Override
    public String toString() {
        return artist + " - " + title;
    }


    
    
}
