package com.iu.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		int i=0;
		
		//게임
		//1.로그인
		//2.로그인 한 사용자만 게임 가능
		
		//----------------------------------로그인 파트--------------------------------------------
		//1.로그인  2. 종료
		// 1:id,pw 입력 후 로그인 판단
		// 2:종료
		
		//---------------------------------게임 진행 파트-------------------------------------------
		//1.로그인 성공 했을 때 진행
		//레벨은 1로 시작
		//GOLD는 0
		//5렙 달성시 1000gold지급 , 10렙 2000 ,15렙 3000 (지급시마다 알림 출력)
		//모든 몬스터의 경험치는 동일
		//1레벨에서 2레벨 업하려면 3마리
		//2 3 6마리
		//3 4 9마리
		//4 5 12마리
		//...
		//14 15 52마리
		//만렙달성 축하,현재 gold 출력 총 6000골드 나와야함
		for( i=0;i<999;i++) {
			
			System.out.println("아이디를 입력해주세요.");
			int id2 = sc.nextInt();
			System.out.println("비밀번호를 입력해주세요.");
			int pw2 = sc.nextInt();
			
			if(id==id2 && pw==pw2) {
				i=2000000;
			}
		}
		System.out.println("게임을 시작합니다.");
		
		int level = 1;
		int gold = 0;
		int exe = 0;
		
		for(int g =0;g<1000;g++) {
			System.out.println("몬스터를 사냥하시겠습니까? 1.예 2.아니요");
			int cho = sc.nextInt();
			if(cho==1) {
				System.out.println("몬스터 1마리를 죽였습니다.");
				exe = exe+1;
				if(exe == level*3) {
					level=level+1;
					System.out.println("당신의 레벨은"+level+"입니다.");
					
						if(exe==12) {
							System.out.println("1000원지급합니다.");
							gold=gold+1000;
						}else if(exe==27) {
							System.out.println("2000원지급합니다.");
							gold=gold+2000;
						}else if (exe==42) {
							System.out.println("3000원지급합니다.");
							gold=gold+3000;
						}				
					}
					if(level==15) {
						g = 10000000;
					
					
				}
			}
			
		}
		System.out.println("만렙달성 현재골드는"+gold+"입니다.");
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
