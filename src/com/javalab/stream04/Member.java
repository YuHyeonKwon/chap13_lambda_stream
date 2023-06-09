package com.javalab.stream04;

public class Member { // class s

	private String name;
	private String job;
	
	public Member() {
		super();
	}

	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", job=" + job + "]";
	}
	
} // class e
