package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Areaplus implements Serializable {
	private Integer apid ;
	private Integer aid ;
	private String title ;
	public Integer getApid() {
		return apid;
	}
	public void setApid(Integer apid) {
		this.apid = apid;
	}
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
