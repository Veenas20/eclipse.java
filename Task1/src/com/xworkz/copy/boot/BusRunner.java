package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Bus;

public class BusRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bus no=new Bus();
        Bus start=new Bus();
        Bus target=new Bus();
        
        System.out.println(no.number);
        System.out.println(start.starting);
        System.out.println(target.destination);
        
        no.number=33;
        start.starting="Bhadravathi";
        target.destination="Bengluru";
        
        System.out.println(no.number);
        System.out.println(start.starting);
        System.out.println(target.destination);
	}

}
