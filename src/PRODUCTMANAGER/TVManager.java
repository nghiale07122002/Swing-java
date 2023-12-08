/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PRODUCTMANAGER;
import java.util.List;
/**
 *
 * @author ASUS
 */
public interface TVManager {
	public boolean addTV(TV t);
	public boolean editTV(String ID);
	public boolean delTV(String ID);
	public List<TV> searchTV(String name);
	public List<TV> sortedTV(boolean isINC);
}
