package com.iu.s4.objects1;

public class ObjectsMain {

	public static void main(String[] args) {
			System.out.println("Start");
			//main은 프로그램 실행 목적
			//Test 목적
			//main은 어느 클래스 안에 있던지 상관 없음
			
			//학생 한명 생성
			//객체 생성
			//변수 선언과 거의 동일
			//클래스명 변수명 = new 클래스명();
			//     선언    =   생성	
			Student student = new Student();
			student.name="test";
			student.num=20;
			
			System.out.println(student);
			System.out.println(student.name);
			System.out.println(student.num);
			System.out.println(student.avg);
			//학생객체 생성
			
			Student student2 = new Student();
			
			student2.name=("iu");
			student2.num=(30);
			
	
			System.out.println(student2.name);
			System.out.println(student2.num);
			
			student = student2;
			System.out.println(student.name);
			student.name="winter";
			System.out.println(student2.name);
		
			//가비지 collector (메모리가 부족하면 힙영역의 참조 할 수 없는 메모리를 자동으로 삭제)
			
			
			System.out.println("finish");
	}

}
