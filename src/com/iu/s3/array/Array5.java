package com.iu.s3.array;

public class Array5 {

	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		int [] ar2 = new int[ar1.length-1];
		
		
		for(int j=0;j<ar2.length;j++) {
			ar2[j]=ar1[j];
		}
		ar1 = ar2;
	
	
	
		for(int i=0;i<ar1.length;i++) {
		System.out.println(ar1[i]);
	
		}
	
	
	
	
	
	
	
	}

}
