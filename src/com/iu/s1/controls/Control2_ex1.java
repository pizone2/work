package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		int id = 1234;
		int pw = 5678;
		//키보드로 부터 id,pw 를 받아서 로그인 처리
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		int id2 = sc.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		int pw2 = sc.nextInt();
		
		if((int)id2==1234 && pw2==pw ) {
			System.out.println("접속완료.");
			
			
		}else {
			System.out.println("접속실패.");
		}
		

	}

}
