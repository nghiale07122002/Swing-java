/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTMANAGER;

/**
 *
 * @author ASUS
 */
public class Tile extends Product{
    	private String tile_type;
	private float tile_w;
	private float tile_h;
	private String tile_color;

    public Tile() {
    }

    public Tile( String product_ID, String product_name, long product_price, int product_total,String tile_type, float tile_w, float tile_h, String tile_color) {
        super(product_ID, product_name, product_price, product_total);
        this.tile_type = tile_type;
        this.tile_w = tile_w;
        this.tile_h = tile_h;
        this.tile_color = tile_color;
    } 

    public String getTile_type() {
        return tile_type;
    }

    public float getTile_w() {
        return tile_w;
    }

    public float getTile_h() {
        return tile_h;
    }

    public String getTile_color() {
        return tile_color;
    }

    public void setTile_type(String tile_type) {
        this.tile_type = tile_type;
    }

    public void setTile_w(float tile_w) {
        this.tile_w = tile_w;
    }

    public void setTile_h(float tile_h) {
        this.tile_h = tile_h;
    }

    public void setTile_color(String tile_color) {
        this.tile_color = tile_color;
    }

    @Override
    public String toString() {
        return super.toString() +"--"+ tile_type + "--" + tile_w + "--" + tile_h + "--" + tile_color;
    }      
}
