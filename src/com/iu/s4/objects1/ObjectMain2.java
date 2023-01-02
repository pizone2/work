package com.iu.s4.objects1;

public class ObjectMain2 {

	public static void main(String[] args) {
		//Sword Instance 생성
		int n=10;
		Sword iu = new Sword();
		iu.name = "집행검";
		iu.damage = 50;
		iu.level = 3;
		iu.life = 500;
		
		System.out.println(iu.name);
		
		Knight kim = new Knight();
		kim.name = "물주먹";
		kim.hp = 100;
		kim.mp = 100;
		kim.str = 10;
		kim.hea = 10;
		kim.wiz = 10;
		kim.dex = 10;
		
		kim.sword = iu;
		System.out.println(kim.sword.name);
		
		//변수 선언
		Sword s2 = null;
		System.out.println(s2.damage);

	}

}
