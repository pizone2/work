package com.iu.s3.array;


import java.util.Scanner;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int [] ar = new int[3];
		int []ar2=new int[0];
		
		//키보드로 부터 숫자를 입력 받아서 해당 숫자 만큼 배열을 생성
		
		//배열의 값을 키보드로 부터 입력 받고
		//값들을 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 배열 길이를 숫자로 입력하시오.");
		int ar3 = sc.nextInt();
		
		int [] na = new int[ar3];	
		
		int va = 0;
		
		for(int i=0;i<ar3;i++) {
			System.out.println("배열"+i+"에 넣을 값을 입력하시오");
			 va = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(na));
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
