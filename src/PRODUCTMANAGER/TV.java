/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTMANAGER;

/**
 *
 * @author ASUS
 */
public class TV extends Product {
	public static final String TV_OPERATINGSYSTEM = "NULL";
	public static final String TV_RESOLUTION = "NULL";
	public static final String TV_TRADEMARK = "NULL";
	private String tv_operatingSystem;
	private String tv_resolution;
	private String tv_trademark;
	public TV() {
		this(TV.PRODUCT_ID,TV.PRODUCT_NAME,TV.PRODUCT_PRICE,TV.PRODUCT_TOTAL,TV.TV_OPERATINGSYSTEM,TV.TV_RESOLUTION,TV.TV_TRADEMARK);
	}
	public TV(String id,String name,long price,int total ,String tv_operatingSystem, String tv_resolution, String tv_trademark) {
		super(id,name,price,total);
		this.tv_operatingSystem = tv_operatingSystem;
		this.tv_resolution = tv_resolution;
		this.tv_trademark = tv_trademark;
	}
	public String getTv_operatingSystem() {
		return tv_operatingSystem;
	}
	public void setTv_operatingSystem(String tv_operatingSystem) {
		this.tv_operatingSystem = tv_operatingSystem;
	}
	public String getTv_resolution() {
		return tv_resolution;
	}
	public void setTv_resolution(String tv_resolution) {
		this.tv_resolution = tv_resolution;
	}
	public String getTv_trademark() {
		return tv_trademark;
	}
	public void setTv_trademark(String tv_trademark) {
		this.tv_trademark = tv_trademark;
	}
	@Override
	public String toString() {
		return super.toString() + "--"+ tv_operatingSystem + "--" + tv_resolution + "--"
				+ tv_trademark;
	}
}