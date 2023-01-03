package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	
	//start 메서드
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();	
		
		
		System.out.println("학생수를 입력");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		
		
	
		for(int i=0;i<10000;i++) {
			System.out.println("1.학생 정보 입력 2.학생 검색 정보 출력 3.학생의 전체 정보 출력 4.학생 추가 5.종료");
			int cs = sc.nextInt();
			if(cs==5) {
				break;
			}else if (cs==1) {
				System.out.println("등록하였습니다.");
				si.setAllStudents(students);
				
			}else if (cs==2) {
				
				Student student = si.findStudent(students);
				if(student != null) {
					sv.viewOne(student);
				}else {
					System.out.println("학생을 찾지 못하였습니다.");
				}
				
				
				
			}else if (cs==3){
				sv.viewList(students);
			}else if(cs==4){
				System.out.println("학생을 추가합니다.");
				 students = si.setStudent(students);
				
			}else {
				
				System.out.println("번호를 다시 누를것");
				cs = sc.nextInt();
			}
			
		}
		
	}
	
	
	
	
	

}
