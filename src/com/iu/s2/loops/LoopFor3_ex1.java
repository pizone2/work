package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력해주세요.");
		int bun = sc.nextInt();
		System.out.println("초을 입력해주세요.");
		int cho = sc.nextInt();
		int s=0;
		
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 모두 종료한다
		for(int b=0;b<60;b++) {
			
			for(s=0;s<60;s++) {
				System.out.println(b+"분"+s+"초");
				if(b==bun && s==cho) {
					s=70;
				}
				
				
			}
			if(b==bun) {
				b=70;
			}
			
			
		}
		

	
	
	
	
		System.out.println("프로그램 종료");
	
	
	
	}

}
