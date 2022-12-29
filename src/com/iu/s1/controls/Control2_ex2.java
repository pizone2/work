package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 국어점수를 입력하세요.");
		int g = sc.nextInt();
		System.out.println(" 영어점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println(" 수학점수를 입력하세요.");
		int math = sc.nextInt();
		
		int avg = (g + eng + math)/3;
		
		
		//평균이 60점 이상인가??
		//과목당 40점 미안이면 불합격
		if (avg>=60) {
				if(g<40) {
					System.out.println("불합격");
				}else if(eng<40) {
					System.out.println("불합격");
				}else if(math<40) {
					System.out.println("불합격");
				}else {
					System.out.println("합격");
				}
			
		}else{
			System.out.println("불합격");
			
		}

	}

}
