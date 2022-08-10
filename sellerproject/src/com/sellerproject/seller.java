
package com.sellerproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class seller {

	List <Sellermodel> sellerList = new ArrayList <Sellermodel> ();
	
	public void populateRecords() {
		sellerList.add(new Sellermodel(0, "pranav", "pranav@gmail.com", "Chennai"));
		sellerList.add(new Sellermodel(1, "ezhil", "ezhi@gmail.com", "Banglore"));
		sellerList.add(new Sellermodel(2, "ragu", "ragu@gmail.com", "Hyderabad"));
		sellerList.add(new Sellermodel(3, "anand", "anand@gmail.com", "Mumbai"));
		sellerList.add(new Sellermodel(4, "sheela", "sheela@gmail.com", "Pune"));
		sellerList.add(new Sellermodel(5, "Elakiya", "Elakiya@gmail.com", "Indore"));
	}
	
	public void addSeller(int id, String name, String location, String email) {
		sellerList.add(new Sellermodel(id, name, location, email));
		System.out.println("Seller Added");
	}
	
	public void displayAllSellers() {
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

