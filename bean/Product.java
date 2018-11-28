package com.example.luotao.bean;

public class Product {

	private int id;
	private String img_path;
	private String product_title;
	private String sales;
	private String price;
	private String detail;
	private String id_sort;
	private String shopname;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String img_path, String product_title, String sales, String price, String detail,
			String id_sort, String shopname) {
		super();
		this.id = id;
		this.img_path = img_path;
		this.product_title = product_title;
		this.sales = sales;
		this.price = price;
		this.detail = detail;
		this.id_sort = id_sort;
		this.shopname = shopname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg_path() {
		return img_path;
	}
	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getId_sort() {
		return id_sort;
	}
	public void setId_sort(String id_sort) {
		this.id_sort = id_sort;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", img_path=" + img_path + ", product_title=" + product_title + ", sales=" + sales
				+ ", price=" + price + ", detail=" + detail + ", id_sort=" + id_sort + ", shopname=" + shopname + "]";
	}
}
