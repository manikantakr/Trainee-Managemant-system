package com.dell.tms.bean;

public class Trainee {

	private int tId;
	private String tName;
	private String tLocation;
	private String tDomain;
	public Trainee(int tId, String tName, String tLocation, String tDomain) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tLocation = tLocation;
		this.tDomain = tDomain;
	}
	public Trainee() {
		super();
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettLocation() {
		return tLocation;
	}
	public void settLocation(String tLocation) {
		this.tLocation = tLocation;
	}
	public String gettDomain() {
		return tDomain;
	}
	public void settDomain(String tDomain) {
		this.tDomain = tDomain;
	}
	@Override
	public String toString() {
		return "Trainee [tId=" + tId + ", tName=" + tName + ", tLocation=" + tLocation + ", tDomain=" + tDomain + "]";
	}
	
	
	
	
}
