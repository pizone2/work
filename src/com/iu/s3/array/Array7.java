package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		
		int [] ar = {5,1,4};
		int [] arr2 = new int[ar.length+1];
		int [] arr3 = new int[ar.length-1];
		
		//1.데이터추가 - 0번인덱스로 맨 앞으로 추가
		//2.데이터삭제 - 0번인덱스 삭제 맨 앞 삭제
		//3.종료
		int cho = 0;
		int k=1;
		
		while(cho!=3) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.데이터추가 2.데이터삭제 3.종료");
		cho = sc.nextInt();
			
		
				if(cho==1) {
				System.out.println("추가할 번호를 입력하시오.");
				int add = sc.nextInt();
					for(int i=0;i<ar.length;i++) {
					arr2[i+1] = ar[i];
					}
				arr2[0]=add;
				ar = arr2;
					for(int f=0;f<ar.length;f++) {
					System.out.println(ar[f]);
				arr2 = new int[ar.length+1];
				arr3 = new int[ar.length-1];
					}
				}
				
				else if(cho==2) {
					for(int i=0;i<ar.length-1;i++) {
						arr3[i]=ar[i+1];
					}
				ar=arr3;
					for(int m=0;m<ar.length;m++) {
					System.out.println(ar[m]);
				arr3 = new int[ar.length-1];
				arr2 = new int[ar.length+1];
					}
					
				}else {
					cho=3;
				}
		
		
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
