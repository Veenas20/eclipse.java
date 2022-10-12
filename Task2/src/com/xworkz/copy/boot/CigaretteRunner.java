package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {

		Cigarette cigaretteData;
		cigaretteData=new Cigarette();
		System.out.println(cigaretteData.color);
		System.out.println(cigaretteData.name);
		System.out.println(cigaretteData.flavour);
		System.out.println(cigaretteData.type);
		System.out.println(cigaretteData.brand);
		System.out.println(cigaretteData.shopname);
		System.out.println(cigaretteData.ownername);
		System.out.println(cigaretteData.odour);
		System.out.println(cigaretteData.founder);
		
		cigaretteData.price=180;
		System.out.println(cigaretteData.price);
		cigaretteData.manufactureDate="June";
		System.out.println(cigaretteData.manufactureDate);
		cigaretteData.taste=false;
		System.out.println(cigaretteData.taste);
		cigaretteData.expiryDate="Sepetember";
		System.out.println(cigaretteData.expiryDate);
		cigaretteData.quantity="One Pack";
		System.out.println(cigaretteData.quantity);
		cigaretteData.quanlity=true;
		System.out.println(cigaretteData.quanlity);
		cigaretteData.manufactureCountry="India";
		System.out.println(cigaretteData.manufactureCountry);
		cigaretteData.manufacturer="Imperial Brand";
		System.out.println(cigaretteData.manufacturer);
		cigaretteData.companyName="ITC";
		System.out.println(cigaretteData.companyName);

	}

}
