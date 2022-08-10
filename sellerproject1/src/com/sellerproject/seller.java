
package com.sellerproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class seller {

	List <seller1> sellerList = new ArrayList <seller1> ();
	
	public void populateRecords() {
		sellerList.add(new seller1(100, "pranav", "pranav@gmail.com", "Chennai"));
		sellerList.add(new seller1(101, "ezhil", "ezhi@gmail.com", "kerala"));
		sellerList.add(new seller1(102, "ragu", "ragu@gmail.com", "uttarkhand"));
		sellerList.add(new seller1(103, "anand", "anand@gmail.com", "rajasthan"));
		sellerList.add(new seller1(104, "sheela", "sheela@gmail.com", "kashmir"));
		sellerList.add(new seller1(105, "Elakiya", "Elakiya@gmail.com", "haryana"));
		sellerList.add(new seller1(105, "ramu", "ram1@gmail.com", "haryana"));
		sellerList.add(new seller1(105, "gugan", "gugan34@gmail.com", "haryana"));
		sellerList.add(new seller1(105, "harni", "harni23@gmail.com", "haryana"));
	}
	
	public void addSeller(int id, String name, String location, String email) {
		sellerList.add(new seller1(id, name, location, email));
		System.out.println("Seller Add....");
	}
	
	public void displaySellers() {
		sellerList.stream().forEach((seller) -> System.out.println(seller));
	}
	
	public void searchById(int id) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void deleteById(int id) {
		
		sellerList =  sellerList.stream()
		.filter((seller) -> id != seller.getId())
		.collect(Collectors.toList());
		
		sellerList.stream()
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void updateById(int id, String name, String location, String email) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> {
			seller.setId(id);
			seller.setName(name);
			seller.setEmail(email);
			seller.setLocation(location);
		});
		
		sellerList.stream().forEach((seller) -> System.out.println(seller));

	}
	
	public void displayByLocation(String location) {
		sellerList.stream()
		.filter((seller) -> location.equals(seller.getLocation()))
		.forEach((seller) -> System.out.println(seller));
	}
	
}

