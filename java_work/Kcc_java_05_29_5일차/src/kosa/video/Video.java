package kosa.video;

import java.util.ArrayList;
import java.util.List;

public class Video {
	private int videoNo;
	private String videoTitle;
	private String actor;
	private GeneralMember member;
	
	public Video() {
		
	}

	public Video(int videoNo, String videoTitle, String actor) {
		super();
		this.videoNo = videoNo;
		this.videoTitle = videoTitle;
		this.actor = actor;
		member = new GeneralMember();
	}
	

	public int getVideoNo() {
		return videoNo;
	}

	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
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
