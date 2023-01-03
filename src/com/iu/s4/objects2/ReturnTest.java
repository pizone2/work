package com.iu.s4.objects2;

import java.util.Random;

import com.iu.s4.objects1.ex1.Student;

public class ReturnTest {
	public void t1() {
		System.out.println("return이 없을 때는 void");
	}
	
	public int t2() {
		Random random = new Random();
		System.out.println("return 은 int");
		return random.nextInt(50);  //50미만의 무작위 수
	}
	
	
	public int [] t3() {
		int [] ar = new int [3];
		return ar;
	}
	
	public void t4() {
		
		
	}

}
