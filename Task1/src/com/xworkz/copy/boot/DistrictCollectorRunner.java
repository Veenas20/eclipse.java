package com.xworkz.copy.boot;

import com.xworkz.copy.thing.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistrictCollector hesru=new DistrictCollector();
		DistrictCollector vayasu=new DistrictCollector();
		DistrictCollector jille=new DistrictCollector();
		DistrictCollector krmaSakke=new DistrictCollector();
        
        System.out.println(hesru.name);
        System.out.println(vayasu.age);
        System.out.println(jille.district);
        System.out.println(krmaSakke.batchNo);
        
        hesru.name="Aishu";
        vayasu.age=22;
        jille.district="Shivamogga";
        krmaSakke.batchNo=03;
        
        System.out.println(hesru.name);
        System.out.println(vayasu.age);
        System.out.println(jille.district);
        System.out.println(krmaSakke.batchNo);
	}
	

}
