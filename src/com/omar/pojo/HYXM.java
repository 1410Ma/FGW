package com.omar.pojo;

public class HYXM {
	
	private Integer id;
	private String name;
	private String time;
	private String address;
	private String content;
	private String cp;
	private String select;
	
	public HYXM(){}
	
	public HYXM(String name, String time, String address, String content, String cp, String select) {
		super();
		this.name = name;
		this.time = time;
		this.address = address;
		this.content = content;
		this.cp = cp;
		this.select = select;
	}

	public HYXM(Integer id, String name, String time, String address, String content, String cp, String select) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.address = address;
		this.content = content;
		this.cp = cp;
		this.select = select;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}
	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * @return the select
	 */
	public String getSelect() {
		return select;
	}
	/**
	 * @param select the select to set
	 */
	public void setSelect(String select) {
		this.select = select;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HYXM [id=" + id + ", name=" + name + ", time=" + time + ", address=" + address + ", content=" + content
				+ ", cp=" + cp + ", select=" + select + "]";
	}
	
	

}
