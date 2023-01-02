package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력 a,b
		//3. 학생수 만큼 번호,국어,영어,수학 입력
		// a 학생의 번호 :
		// a 학생의 국어 :
		// a 학생의 영어 :
		// a 학생의 수학 :
		// 총점 평균 계산 
		// b 학생의 ..
		// b 학생의 ..
		// b 학생의 ..
		// b 학생의 ..
		//배열7개만들어야함
		
		//모든 학생의 정보 출력
		//이름 번호 국어 영어 수학  총점 평균
		//a   1   32  23  23
		//,,,
		int sum;
		int avg;
		String name;
		int number;
		int kor;
		int eng;
		int math;
		String [] names =new String[100];
		int [] numbers =new int[100];
		int [] kors =new int[100];
		int [] engs =new int[100];
		int [] maths =new int[100];
		int [] sums =new int[100];
		int [] avgs =new int[100];
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("학생수를 입력해주세요.");
		int su = sc.nextInt();
		for(int i=0;i<su;i++) {
			System.out.println("학생의 이름을 입력해주세요.");
			 name = sc.next();
			 names [i] = name;
			System.out.println("학생의 국어점수를 입력해주세요.");
			 kor = sc.nextInt();
			 kors [i] = kor;
			System.out.println("학생의 영어점수를 입력해주세요.");
			 eng = sc.nextInt();
			 engs [i] = eng;
			System.out.println("학생의 수학점수를 입력해주세요.");
			 math = sc.nextInt();
			 maths [i] = math;
			System.out.println("학생의 번호를 입력해주세요.");
			 number = sc.nextInt();
			 numbers [i] = number;
			
			 sums [i] = (kor+eng+math);
			 avgs [i] = (kor+eng+math)/3;
		}
		
		for(int j=0;j<su;j++) {
			System.out.println("이름:"+names[j]+"/번호:"+numbers[j]+"/국어점수:"+kors[j]+"점/영어점수:"+engs[j]+"점/수학점수:"+maths[j]+"점/총점:"+sums[j]+"/평균:"+avgs[j]  );
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
