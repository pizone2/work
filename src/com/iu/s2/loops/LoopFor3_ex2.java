package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {

	public static void main(String[] args) {
		//배그
		//총알 30발 -> 1탄창
		//캐릭터당  -> 3탄창
		
		//1.단발 
		//2.점사

		//1번이면 "탕" 30번 반복 출력
		//2번이면 "타타탕" 10번 반복출력
		
		//탄창교체
		Scanner sc = new Scanner(System.in);
		for(int j=0;j<3;j++) {
			System.out.println("1.단발  2.점사");
			int cho = sc.nextInt();
			
			if(cho==1) {
				for(int i=0;i<30;i++) {
					System.out.println("탕");
				}
				System.out.println("탄창을 교체합니다.");
			}else {
				for(int i=0;i<10;i++) {
					System.out.println("타타탕");
				}
				System.out.println("탄창을 교체합니다.");
			}
		}
		System.out.println("총알을 모두 사용하셨습니다.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
