package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Area implements Serializable {
	private Integer aid ;
	private String title ;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
