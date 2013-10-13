package com.ddj.sqlite.model;

public class User {
	
	private int id;
	private String name;
	private int songId;
	private int vote;

	//Constructor
	public User() {
	}

	//getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSongId() {
		return songId;
	}

	public int getVote() {
		return vote;
	}

	//setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public void setVote(int vote) {
		this.vote = vote;
	}
}