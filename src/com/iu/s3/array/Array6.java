package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
			
		int[] ar = {8,5,13,9,6};
		int[] ar2= new int[ar.length-1];
		//키보드로 부터 삭제하고 싶은 값을 입력 받기
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("삭제하고 싶은 값을 입력하세요.");
		int scc = sc.nextInt();
		
		int idx = 0;
		
		for(int k=0;k<ar.length;k++) {
			if (ar[k]==scc) {
				continue;
			}else {
				ar2[idx]=ar[k];
				idx++;
				
			}
		}

		ar=ar2;		
		for(int j=0;j<ar.length;j++) {
			System.out.println(ar[j]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
