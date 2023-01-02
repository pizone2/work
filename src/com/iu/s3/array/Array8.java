package com.iu.s3.array;

public class Array8 {

	public static void main(String[] args) {
		int [] ar = {9,5,8,3,6};
		
		
		//9,8,6,5,3 내림차순
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				
				if(ar[i]<ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}

	
		
		for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]);
		}
		
		
	
	
	
	
	
	
	
	
	}
	

}
