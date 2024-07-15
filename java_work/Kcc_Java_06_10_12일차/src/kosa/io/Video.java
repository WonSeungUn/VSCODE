package kosa.io;

import java.io.Serializable;

public class Video implements Serializable {
	private int videoNo;
	private String videoTitle;
	private String actor;
	
	public Video() {
		
	}

	public Video(int videoNo, String videoTitle, String actor) {
		super();
		this.videoNo = videoNo;
		this.videoTitle = videoTitle;
		this.actor = actor;
	}
	

	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}

	@Override
	public String toString() {
		return "Video [videoNo=" + videoNo + ", videoTitle=" + videoTitle + ", actor=" + actor + "]";
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
}
