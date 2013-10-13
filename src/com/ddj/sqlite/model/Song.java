package com.ddj.sqlite.model;

public class Song {
	
	private String artist;
	private String genre;
	private int id;
	private String lastPlayedOn;
	private String name; 

	//Constructor
	public Song() {
	}

	//getters
	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public int getId() {
		return id;
	}

	public String getLastPlayedOn() {
		return lastPlayedOn;
	}

	public String getName() {
		return name;
	}

	//setters
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastPlayedOn(String lastPlayedOn) {
		this.lastPlayedOn = lastPlayedOn;
	}

	public void setName(String name) {
		this.name = name;
	}
}