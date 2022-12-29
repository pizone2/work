package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
		
				int id = 1234;
				int pw = 5678;
				//키보드로 부터 id,pw 를 받아서 로그인 처리
				Scanner sc =new Scanner(System.in);
				System.out.println("아이디를 입력하세요.");
				int id2 = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				int pw2 = sc.nextInt();
				//로그인이 성공 했을 때만 실행
				//급여를 입력
				//정규직이면 1을, 계약직이면 2를 입력
				//실급여 계산
				//정규직: 고용보험 2%, 의료보험 3%,국민연금 1%,산재보험 1%
				//계약직 : 원천징수 3.3%
				//실급여 출력
				int nas =0;
				double realmoney = 0;
				
				if((int)id2==1234 && pw2==pw ) {
					System.out.println("접속완료.");
					System.out.println("정규직이면 1,계약직이면 2를 입력하세요.");
					nas = sc.nextInt();
					System.out.println("실급여를 입력하세요.");
					realmoney = sc.nextInt();
					
					
				}else {
					System.out.println("접속실패.");
				}
				///////////////////////////////////////////////////////////////////
				if(nas==1) {
					realmoney = realmoney * 0.93;
					System.out.println("실급여 : "+realmoney);
					
					
					
				}else if (nas==2) {
					realmoney = realmoney * 0.967;
					System.out.println("실급여 : "+realmoney);
					
				}
				

	}

}
