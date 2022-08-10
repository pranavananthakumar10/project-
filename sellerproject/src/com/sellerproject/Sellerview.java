package com.sellerproject;

public class Sellerview {



	public static void main(String[] args) {
		seller sc = new seller();
		
	sc.populateRecords();
		
	//	sc.displayAllSellers();
		
//		sc.addSeller(16, "guna", "guna@gmail.com", "pune");
//		
	// sc.displayAllSellers();
		
//		sc.deleteById(4);
		
//		sc.updateById(2, "sathish", "kerala", "sathy@gamil.com");
		
		sc.displayByLocation("Chennai");
	}

}