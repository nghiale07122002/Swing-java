/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTMANAGER;

/**
 *
 * @author ASUS
 */
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TVimpl implements TVManager,Serializable {
	private List<TV> list;
	Scanner sc = new Scanner(System.in);
	FileWriter fw;
        BufferedWriter bw;
        FileReader fr;
        BufferedReader br;
//        FileOutputStream fout;
//	FileInputStream fis;
//	ObjectOutputStream oos;
//	ObjectInputStream ois;
	public TVimpl() {
		list = new ArrayList<>();
	}
        public int size(){
            return list.size();
        }
	public void display() {
		for(TV i:list) {
			System.out.println(i + "\n----------------------");
		}
	}

	
        public void writeFile(){
            try {
                fw = new FileWriter("src\\PRODUCTMANAGER\\Product.bin");
                bw = new BufferedWriter(fw);
                for(TV temp: list){
                    bw.write(temp.toString());
                    bw.newLine();
                }
                System.out.println("Success");
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        public List<TV> readFile(){
            List<TV> ds = new ArrayList<>();
            try {
                fr = new FileReader("src\\PRODUCTMANAGER\\Product.bin");
                br = new BufferedReader(fr);
                String line = " ";
                while(true){
                    line = br.readLine();
                    if(line == null){
                        break;
                    }
                    String[] txt = line.split("--");
                    String ID = txt[0];
                    String name = txt[1];
                    int price = Integer.parseInt(txt[2]);
                    int total = Integer.parseInt(txt[3]);
                    String os = txt[4];
                    String rso = txt[5];
                    String tm = txt[6];
                    ds.add(new TV(ID, name , price, total, os, rso, tm));
                }
                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ds;
        }
        
	@Override
	public boolean addTV(TV t) {
		for(TV i : list) {
			if(i.getProduct_ID().equals(t.getProduct_ID())) {
				return false;
			}
		}
		return this.list.add(t);
	}
	@Override
	public boolean editTV(String ID) {
		for(TV i : list) {
			if(i.getProduct_ID().equals(ID)) {
				i.setProduct_name(inputName());
				i.setProduct_price(inputPrice());
				i.setProduct_total(inputTotal());
				sc.nextLine();
				i.setTv_operatingSystem(inputOperatinSystem());
				i.setTv_resolution(inputResolution());
				i.setTv_trademark(inputTrademark());
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean delTV(String ID) {
		for(TV i : list) {
			if(i.getProduct_ID().equals(ID)) {
				return list.remove(i);
			}
		}
		return false;
	}
	@Override
	public List<TV> searchTV(String name) {
		List<TV> result = new ArrayList<>();
		for(TV i : list) {
			if(i.getProduct_name().contains(name)) {
				result.add(i);
			}
		}
		return result;
	}
	@Override
	public List<TV> sortedTV(boolean isINC) {
		if(isINC) {
			Collections.sort(list,new SortedTV());
		}else {
			Collections.sort(list,new SortedTV().reversed());
		}
		return list;
	}
        
	private String inputName() {
		System.out.println("Import newName:");
		return sc.nextLine();
	}
	private long inputPrice() {
		System.out.println("Import newprice:");
		return sc.nextLong();
	}
	private int inputTotal() {
		System.out.println("Import newTotal:");
		return sc.nextInt();
	}
	private String inputOperatinSystem() {
		System.out.println("Import OpetatingSytem:");
		return sc.nextLine();
	}
	private String inputResolution() {
		System.out.println("Import newResolution:");
		return sc.nextLine();
	}
	private String inputTrademark() {
		System.out.println("Import newTrademark:");
		return sc.nextLine();
	}
}

class SortedTV implements Comparator<TV>{

	@Override
	public int compare(TV o1, TV o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getProduct_price() - o2.getProduct_price());
	}
	
}