package com.example.luotao.bean;

public class Massage {

	private int id;
	private String massage_path;
	private String massage_title;
	public Massage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Massage(int id, String massage_path, String massage_title) {
		super();
		this.id = id;
		this.massage_path = massage_path;
		this.massage_title = massage_title;
	}
	public Massage(String massage_path, String massage_title) {
		super();
		
		this.massage_path = massage_path;
		this.massage_title = massage_title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMassage_path() {
		return massage_path;
	}
	public void setMassage_path(String massage_path) {
		this.massage_path = massage_path;
	}
	public String getMassage_title() {
		return massage_title;
	}
	public void setMassage_title(String massage_title) {
		this.massage_title = massage_title;
	}

	@Override
	public String toString() {
		return "Massage [id=" + id + ", massage_path=" + massage_path + ", massage_title=" + massage_title + "]";
	}
}
