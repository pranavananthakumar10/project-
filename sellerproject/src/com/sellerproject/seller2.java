package com.sellerproject;

public class seller2 {



	public static void main(String[] args) {
		seller sc = new seller();
		
	sc.populateRecords();
		
	sc.displaySellers();
		
    sc.addSeller(16, "guna", "guna@gmail.com", "pune");
	
	sc.displaySellers();
		
    sc.deleteById(4);
		
	sc.updateById(2, "sathish", "kerala", "sathy@gamil.com");
		
	sc.displayByLocation("Chennai");
	}

}