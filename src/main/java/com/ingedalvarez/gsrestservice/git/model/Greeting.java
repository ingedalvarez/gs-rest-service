package com.ingedalvarez.gsrestservice.git.model;

public class Greeting {
	private final long id;
	private final String content;
	/**
	 * @param id unique identifier for the greeting,
	 * @param content textual representation of the greeting
	 */
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
	

}
