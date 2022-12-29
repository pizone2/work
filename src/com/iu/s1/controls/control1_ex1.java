package com.iu.s1.controls;

import java.util.Scanner;

public class control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 부터 국어,영어,수학 점수 입력 받음
		//총점 과 평균 계산
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//그외 F를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println(" 국어점수를 입력하세요.");
		int g = sc.nextInt();
		System.out.println(" 영어점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println(" 수학점수를 입력하세요.");
		int math = sc.nextInt();
		
		int avg = (g + eng + math)/3;
		String level="";
		
		if(avg>=90) {
			System.out.println("A");
			level= "A"; 
		}else if(avg>=80) {
			System.out.println("B");
			level= "B";
		}else if (avg>=70) {
			System.out.println("C");
			level= "C";
		}else {
			System.out.println("F");
			level= "D";
		//출력문을 한번만 사용
			
		System.out.println(level);
			
		}
		

	
	}

}
