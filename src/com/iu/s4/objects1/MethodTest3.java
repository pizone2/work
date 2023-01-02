package com.iu.s4.objects1;

public class MethodTest3 {
	
	public void t3(int salary,double des) {
//					↑매개변수들 선언(여러개 선언받을 수 있음,어떠한 타입도 가능)
			//실급여를 계산하는 메서드
		salary= (int)(salary*0.97);
		System.out.println("T3 : "+salary);
	}
	
	public void info(Sword soword) {
		System.out.println(soword.name);
		System.out.println(soword.damage);
		
	}
		//Sword 모든 정보를 출력
	

}
