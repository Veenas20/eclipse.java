package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer hesru=new Developer();
		Developer vidhyabyasa=new Developer();
		Developer anubhava=new Developer();
		Developer sambala=new Developer();
		Developer kampani=new Developer();
        
        System.out.println(hesru.name);
        System.out.println(vidhyabyasa.education);
        System.out.println(anubhava.experience);
        System.out.println(sambala.salary);
        System.out.println(kampani.company);
        
        hesru.name="Veena S";
        vidhyabyasa.education="BE";
        anubhava.experience=3;
        sambala.salary=30000;
        kampani.company="MindTree";
        
        System.out.println(hesru.name);
        System.out.println(vidhyabyasa.education);
        System.out.println(anubhava.experience);
        System.out.println(sambala.salary);
        System.out.println(kampani.company);
	}

}
