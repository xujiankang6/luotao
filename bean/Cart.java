package com.example.luotao.bean;

public class Cart {

	private int id;
	private String img_path;
	private String product_title;
	private String count;
	private String price;
	
	
	public Cart(int id, String img_path, String product_title, String count, String price) {
		super();
		this.id = id;
		this.img_path = img_path;
		this.product_title = product_title;
		this.count = count;
		this.price = price;
	}
	public Cart() {
		super();
	}
	
	public Cart( String img_path, String product_title, String count, String price) {
		super();
		
		this.img_path = img_path;
		this.product_title = product_title;
		this.count = count;
		this.price = price;
	}
//	public Cart(String drawableName1, String cart_title, String string, TextView detail_price) {
//		super();
//	}
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
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", img_path=" + img_path + ", product_title=" + product_title + ", count=" + count
				+ ", price=" + price + "]";
	}
}
