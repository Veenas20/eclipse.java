package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		Tea teaData;
		teaData=new Tea();
		System.out.println(teaData.color);
		System.out.println(teaData.name);
		System.out.println(teaData.flavour);
		System.out.println(teaData.type);
		System.out.println(teaData.brand);
		System.out.println(teaData.shopname);
		System.out.println(teaData.ownername);
		
		teaData.cupType="Plastic";
		System.out.println(teaData.cupType);
		teaData.founder="Emperor Shen Nung";
		System.out.println(teaData.founder);
		teaData.price=30;
		System.out.println(teaData.price);
		teaData.teaPlants="Camellia Sinensis";
		System.out.println(teaData.teaPlants);
		teaData.taste=true;
		System.out.println(teaData.taste);
		teaData.ownerMotherName="Radha";
		System.out.println(teaData.ownerMotherName);
		teaData.quantity="Full";
		System.out.println(teaData.quantity);

	}

}
