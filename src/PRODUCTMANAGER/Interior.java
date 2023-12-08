/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTMANAGER;

/**
 *
 * @author ASUS
 */
public class Interior extends Product {
    	public static final String INTERIOR_MATERIAL = "NULL";
	public static final float INTERIOR_WEIGHT = 0;
	public static final String INTERIOR_COLOR = "NULL";
	private String Interior_Material;
	private float Interior_Weight;
	private String Interior_Color;
	
	

	public Interior() {
		this(Interior.PRODUCT_ID,Interior.PRODUCT_NAME,Interior.PRODUCT_PRICE,Interior.PRODUCT_TOTAL,
				Interior.INTERIOR_MATERIAL,Interior.INTERIOR_WEIGHT,Interior.INTERIOR_COLOR);
	}
	
	public Interior(String productID, String productName, long productPrice, int productToTal,
			String interior_Material, float interior_Weight, String interior_Color) {
		super(productID, productName, productPrice, productToTal);
		this.Interior_Material = interior_Material;
		this.Interior_Weight = interior_Weight;
		this.Interior_Color = interior_Color;
	}

	public String getInterior_Material() {
		return Interior_Material;
	}

	public float getInterior_Weight() {
		return Interior_Weight;
	}

	public String getInterior_Color() {
		return Interior_Color;
	}

	public void setInterior_Material(String interior_Material) {
		Interior_Material = interior_Material;
	}

	public void setInterior_Weight(float interior_Weight) {
		Interior_Weight = interior_Weight;
	}

	public void setInterior_Color(String interior_Color) {
		Interior_Color = interior_Color;
	}

	@Override
	public String toString() {
		return super.toString() + "--" 
				+ Interior_Material + "--" + Interior_Weight + "--"
				+ Interior_Color;
	}

}
