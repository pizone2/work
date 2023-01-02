package com.iu.s4.objects1.ex1;

public class Main {
	public static void main(String[] args) {
		
		MenuController md = new MenuController();
		StudentView sc = new StudentView();
		Student student = new Student();
		student.avg = 23;
		student.eng = 24;
		student.kor = 66;
		student.num = 2;
		student.total = 32;
		student.math = 34;
		student.name = "김";
		Student student2 = new Student();
		student2.avg = 23;
		student2.eng = 24;
		student2.kor = 66;
		student2.num = 2;
		student2.total = 32;
		student2.math = 34;
		student2.name = "김";
		
		Student [] students = new Student [2];
		students[0] = student;
		students[1] = student2;
		
		sc.viewOne(student);
		sc.viewList(students);
	
	}

}
