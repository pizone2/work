package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//Game : TRPG
		//법사
		String name = "핫팩";
		int hp = 20;
		int mp = 20;
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		//1.HP보충(포션) 2.MP보충 3.마법1 4.마법2 5.턴을 넘기기
		// HP,MP 보충시 최대 40까지 보충가능
		//보충시 랜덤하게 0~40사이의 숫자를 받아서 HP,MP에 더하기
		//유저의 이름과 HP,MP
		int test = random.nextInt(41); // 0~40미만의 정수하나를 리턴
		int test2 = random.nextInt(30);
		//System.out.println("test:"+test);
		//System.out.println("test2:"+test2);
		
		System.out.println("1.HP보충 2.MP보충 3.에너지볼트 4.파이어볼 5.턴을 넘기기");
		int ps = sc.nextInt();
		////////////////////////////HP보충///////////////////////////////////////
		if(ps==1) {
			if(hp+test>40) {
				hp = 40;
			}else {
				hp = hp+test;
			}
			System.out.println("HP는"+hp+"입니다.");
		////////////////////////////MP보충///////////////////////////////////////
		}else if (ps==2) {
			if(mp+test>40) {
				mp = 40;
			}else {
				mp = mp+test;
			}
			System.out.println("MP는"+mp+"입니다.");
		//////////////////////////////에너지볼트////////////////////////////////////
		}else if (ps==3) {
			monsterHp = monsterHp-test;
				if(monsterHp<0) {
					monsterHp = 0;
					System.out.println(" @@오크사망@@");
				}
			System.out.println("에너지볼트!!!▐ ☯ ᴥ ☯ ▐");
			System.out.println("에너지볼을 오크에게 -" +test+ "적중시켰습니다.");
			System.out.println("오크 HP:"+monsterHp);
				mp= mp-3;
			System.out.println("핫팩님의 HP:"+hp+", MP:"+mp);
			
				
		///////////////////////////////파이어볼/////////////////////////////////////
		}else if (ps==4) {
			monsterHp = monsterHp-test;
				if(monsterHp<0) {
					monsterHp = 0;
					System.out.println(" @@오크사망@@");
				}
			System.out.println("파이어볼!!!(」ﾟﾛﾟ)｣NOOOooooo━");
			System.out.println("파이어볼을 오크에게 -" +test+ "적중시켰습니다.");
			System.out.println("오크 HP:"+monsterHp);
				mp= mp-3;
			System.out.println("핫팩님의 HP:"+hp+", MP:"+mp);
		//////////////////////////////턴을 넘김/////////////////////////////////////
		}else if (ps==5) {
			System.out.println("턴을 넘깁니다.");
		}
		
		if(monsterHp<=0) {
			System.out.println("Game Clear!");
			
		}
		
		
		
		
		
		
	}

}
