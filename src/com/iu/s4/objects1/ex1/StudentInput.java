package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class StudentInput {
	
	//findStudent
	//학생배열을 받아서
	//학생의 번호를 입력받아서 일치하는 학생을 리턴 없으면 null;
	public Student findStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력");
		int num = sc.nextInt();
		
		Student student = null;
		
		for(int i=0; i<students.length; i++) {
			if(num==students[i].num) {
				student = students[i];
//				return 	students[i];
			}
			
		}
		return student;
//		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void setAllStudentss(Student [] students) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name=sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			
			student.total=student.kor+student.eng+student.math;
			student.avg = student.total/3.0;
			
			students[i]=student;
		}
		System.out.println("학생의 번호를 입력하시오.");
		int scnum = sc.nextInt();
			for(int i = 0; i < students.length; i++) {
				if(students[i].num ==scnum) {
					
				}
			}
		
	}
	
	//setStudent
	//학생한명 객체를 생성해서, 이름 ,번호,국어 ,영어 ,수학 입력
	//총점 평균을 계산
	
	//setAllStudents
	//매개변수로 학생배열을 받아서
	//배열의 수만큼 학생 객체를 생성해서 이름 ,번호,국어 ,영어 ,수학 입력
	//총점 평균을 계산
	//학생 객체를 배열에 대입
	public static void main(String[] args) {
		
		//No.1
//		Student student = new Student();
////		setStudent(student);
//		
//		//No.2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("학생수를 입력하시오.");
//		int studentCount = sc.nextInt();
//		
//		Student[] students = new Student[studentCount];
//		
//		for(int i = 0; i < studentCount;i++) {
//			students[i] = new Student();
//			
//		}
////		setAllStudents(students);
		
	}
	
	public Student[] setStudent(Student [] students) {
		
		Scanner sc = new Scanner(System.in);
		Student student =new Student();
		System.out.println("이름을 입력하세요");
		student.name = sc.next();
		System.out.println("번호을 입력하세요");
		student.num = sc.nextInt();
		System.out.println("국어을 입력하세요");
		student.kor = sc.nextInt();
		System.out.println("영어을 입력하세요");
		student.eng = sc.nextInt();
		System.out.println("수학을 입력하세요");
		student.math = sc.nextInt();
		student.total = student.kor + student.eng + student.math;
		student.avg = (student.kor + student.eng + student.math)/3;
		System.out.println("총점 :"+student.total);
		System.out.println("평균 :"+student.avg);
		
		Student [] studentsnew = new Student[students.length+1];
		for(int i=0;i<students.length;i++) {
			studentsnew[i] = students[i];
		}
		studentsnew[students.length] = student;
		return studentsnew;
		
		
		
		
		
	
	}
//	public static void setAllStudents(Student[] students) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i < students.length; i++) {
////			Student student = new Student() ;
//			
//			System.out.println("이름을 입력하세요");
//			students[i].name = sc.next();
//			System.out.println("번호을 입력하세요");
//			students[i].num = sc.nextInt();
//			System.out.println("국어을 입력하세요");
//			students[i].kor = sc.nextInt();
//			System.out.println("영어을 입력하세요");
//			students[i].eng = sc.nextInt();
//			System.out.println("수학을 입력하세요");
//			students[i].math = sc.nextInt();
//			students[i].total = students[i].kor + students[i].eng + students[i].math;
//			students[i].avg = (students[i].kor + students[i].eng + students[i].math)/3;
//			System.out.println("총점 :"+students[i].total);
//			System.out.println("평균 :"+students[i].avg);
//			
//		}
	public void setAllStudents(Student [] students) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name=sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("국어 입력");
			student.kor = sc.nextInt();
			System.out.println("영어 입력");
			student.eng = sc.nextInt();
			System.out.println("수학 입력");
			student.math = sc.nextInt();
			
			student.total=student.kor+student.eng+student.math;
			student.avg = student.total/3.0;
			
			students[i]=student;
			
		}
		
	}



}








