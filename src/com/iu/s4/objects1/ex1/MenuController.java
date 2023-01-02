package com.iu.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	
	//start 메서드
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	public void start() {
		Scanner ac = new Scanner(System.in);
		System.out.println("1.등록 2.수정 3.삭제 4.종료");
		int cs = ac.nextInt();
		
		for(int i=0;i<10000;i++) {
			if(cs==4) {
				break;
			}else if (cs==1) {
				System.out.println("등록하였습니다.");
				System.out.println("1.등록 2.수정 3.삭제 4.종료");
				cs = ac.nextInt();
			}else {
				
				System.out.println("1.등록 2.수정 3.삭제 4.종료");
				cs = ac.nextInt();
			}
			
		}
		
	}
	
	
	
	
	

}
