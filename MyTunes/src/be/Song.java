/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLength() {
        return length;
    }
    
    public String getPath() {
        return path;
    }

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
        return title;
    }


    
    
}
