package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	
	//setStudent
	//학생한명 객체를 생성해서, 이름 ,번호,국어 ,영어 ,수학 입력
	//총점 평균을 계산
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름 ,번호,국어 ,영어 ,수학 입력
	//총점 평균을 계산
	//학생 객체를 배열에 대입
	
	public class setStudent{
		String name;
		int num;
		int kor;
		int eng;
		int math;
		int total;
		double avg;
	}
	public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("이름을 입력하세요.");
	name = sc.next();
	
	}
}
