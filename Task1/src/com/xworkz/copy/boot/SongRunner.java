package com.xworkz.copy.boot;

import com.xworkz.copy.thing.Song;

public class SongRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song hesru=new Song();
		Song bashe=new Song();
		Song hadugararu=new Song();
		Song bharahagararu=new Song();
		Song vida=new Song();
        
        System.out.println(hesru.name);
        System.out.println(bashe.language);
        System.out.println(hadugararu.singer);
        System.out.println(bharahagararu.lyricst);
        System.out.println(vida.type);
        
        hesru.name="Arabic Kuthu";
        bashe.language="Tamil";
        hadugararu.singer="Anirudh";
        bharahagararu.lyricst="Shivakarthigen";
        vida.type="Jolly song";
        
        System.out.println(hesru.name);
        System.out.println(bashe.language);
        System.out.println(hadugararu.singer);
        System.out.println(bharahagararu.lyricst);
        System.out.println(vida.type);
	}

}
