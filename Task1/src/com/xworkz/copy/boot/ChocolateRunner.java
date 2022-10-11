package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate hesru=new Chocolate();
		Chocolate mudre=new Chocolate();
		Chocolate belle=new Chocolate();
		Chocolate vida=new Chocolate();
        
        System.out.println(hesru.name);
        System.out.println(mudre.brand);
        System.out.println(belle.price);
        System.out.println(vida.flavour);
        
        hesru.name="White Chocolate";
        mudre.brand="Milky Bar";
        belle.price=30;
        vida.flavour="Strawberry";
        
        System.out.println(hesru.name);
        System.out.println(mudre.brand);
        System.out.println(belle.price);
        System.out.println(vida.flavour);
        
	}


}
