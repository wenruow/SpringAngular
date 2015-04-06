package com.angular;

public class greeting {

	private long id;
	private String content;
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
	
	public greeting() {
		super();
	}
	public greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
}
