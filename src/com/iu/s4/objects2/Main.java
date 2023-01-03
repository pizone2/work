package com.iu.s4.objects2;

public class Main {

	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
//		int num = returnTest.t1(); /void라 오류
		returnTest.t1();
		
//		returnTest.t2();//요리는 나왔는데 서빙한테 안 준 상태
		int num = returnTest.t2();
		
		System.out.println(num);
		
		int [] ar = returnTest.t3();
		
		
	}

}
