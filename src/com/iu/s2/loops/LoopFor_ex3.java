package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		//로그인 시도 총 5번 시도가능
		//반복문 종료 후
		//로그인이 성공 했으면 "환영합니다" 출력
		//로그인이 실패 했으면 "은행을 방문하세요" 출력
		for(int i=0;i<5;i++) {
			System.out.println("아이디를 입력하세요.");
			int id2 = sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int pw2 = sc.nextInt();
				if (id==id2 && pw==pw2) {
					i=5;
					System.out.println("환영합니다.");
					
				}else {
					System.out.println("다시 입력해주세요.");
					
				}
		}
		
		System.out.println("은행을 방문하세요.");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
