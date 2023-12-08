/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTMANAGER;

/**
 *
 * @author ASUS
 */
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
	private static  Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TVimpl ds = new TVimpl();
		TV p1 = new TV("01","Smart Tivi Samsung 4K",42000000, 5,"Androi","1680 * 720","Sam Sung");
		TV p2 = new TV("02","Smart Tivi Sony 4K",45000000, 10,"Linux","1880 * 1220","Sony");
		TV p3 = new TV("03","Smart Tivi LG 4K",40000000, 8,"IOS","1480 * 920","LG");
		TV p4 = new TV("04","Panasonic Android Tivi 4K",30000000, 8,"Androi","1580 * 920","Panasonic");
		ds.addTV(p1);
		ds.addTV(p2);
		ds.addTV(p3);
		ds.addTV(p4);
		ds.display();
		int choose=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------------MENU--------------");
			System.out.println("---------------Please select function-----");
			System.out.println(
					  "		1.Add a new TV\n"
					+ "		2.Show list up\n"
					+ "		3.Edit information by ID\n"
					+ "		4.Delete information by ID\n"
					+ "		5.Search Tivi by name\n"
					+ "		6.Sort list by price\n"
                                        + "		7.Write data in File\n"          
					+ "		0.Exit----------");
			System.out.println("Input selection: ");
				choose = sc.nextInt();
				sc.nextLine();
				if(choose == 1) {
					System.out.println("-----ENTER TV INFORMATION NEED MORE CODE-----");
					System.out.println("Input newTV ID: "); String id = sc.nextLine();
					System.out.println("Input newTV Name: ");String ten = sc.nextLine();
					System.out.println("Input newTV Price: "); long gia = sc.nextLong();
					System.out.println("Input newTV Total: "); int sl = sc.nextInt();
					sc.nextLine();
					System.out.println("Input newTV OperatingSystem: "); String hdh = sc.nextLine();
					System.out.println("Input new TV Resolution: "); String dpg = sc.nextLine();
					System.out.println("Input new TV Trademark: "); String nsx = sc.nextLine();
					TV tv = new TV(id,ten,gia,sl,hdh,dpg,nsx);
					if(ds.addTV(tv) == false) {
						System.out.println("ID is existed !!!, Can't add ");
					}
                                        ds.writeFile();
				}else if(choose == 2) {
					System.out.println("--------LIST OF TVs--------- ");
					ds.display();
                                        ds.writeFile();
				}else if(choose == 3) {
					System.out.println("Input the ID to edit: ");
					String id = sc.nextLine();
					if(ds.editTV(id)==false) {
						System.out.println("ID is not existed!!!");
					}
                                        ds.writeFile();
				}else if(choose == 4) {
					System.out.println("Input the ID need to delete: ");
					String id = sc.nextLine();
					if(ds.delTV(id) == false) {
						System.out.println("ID is not existed!!!");
					}
                                        ds.writeFile();
				}else if(choose == 5) {
					System.out.println("Input the name of the TV you want to search: ");
					String name = sc.nextLine();
					List<TV> result = new ArrayList<>();
					result = ds.searchTV(name);
					System.out.println("The TV I just searched for is:");
					for(TV i :result) {
						System.out.println(i.toString() + "\n--------------------");
					}
				}else if(choose == 6) {
					ds.sortedTV(true);
					System.out.println("\nList after sorting: ");
					ds.display();
				}else if(choose == 7){  
                                        List<TV> result = new ArrayList<>();
                                        result = ds.readFile();
                                        for(TV t:result){
                                            System.out.println(t.toString());
                                        }
                                }
		}while(choose != 0);
	}
}
