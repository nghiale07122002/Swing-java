/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTMANAGER;

/**
 *
 * @author ASUS
 */
public class Product {
	public static final String PRODUCT_ID = "0";
	public static final String PRODUCT_NAME = "NULL";
	public static final long PRODUCT_PRICE = 0;
	public static final int PRODUCT_TOTAL = 0;
	private String product_ID;
	private String product_name;
	private long product_price;
	private int product_total;
	
	public Product() {
		this(Product.PRODUCT_ID,Product.PRODUCT_NAME,Product.PRODUCT_PRICE,Product.PRODUCT_TOTAL);
	}

	public Product(String product_ID, String product_name, long product_price, int product_total) {
		super();
		this.product_ID = product_ID;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	public String getProduct_ID() {
		return product_ID;
	}

	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public long getProduct_price() {
		return product_price;
	}

	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}

	public int getProduct_total() {
		return product_total;
	}

	public void setProduct_total(int product_total) {
		this.product_total = product_total;
	}

	@Override
	public String toString() {
		return product_ID + "--" + product_name + "--"
				+ product_price + "--" + product_total;
	}
	public static void main(String[] args) {
		Product a = new Product();
		System.out.println(a.toString());
	}
}