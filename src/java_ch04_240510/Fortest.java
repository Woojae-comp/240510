package java_ch04_240510;

public class Fortest {

	public static void main(String[] args) {

		// int i;
		for(int i=1; i <= 10; i++) { //초 조 증 i j k를 많이 씀
			System.out.println(i);
		}
		
		for(int j=1; j <= 100; j=j+2) {
			System.out.println(j);
		}
		for(int k=100; k >= 0; k--) {
			System.out.println(k);
		}
		// 1-100까지 합을 출력하는 반복문을 작성하시오.
		int sum = 0; // sum정수를 변수를 선억ㄴ과 동시에 0으로 초기화
		for(int i=1 ; i <= 100; i++) {
			sum = sum + i;
		}			
			
		System.out.println("sum의 값:" + sum);
		
		//for 문을 이용해서 1부터 100까지의 정수중에서 3의 배수의 총합을 구하는 코드를 작성하시오.
		
		
		// 1,2를 아예 생략해버린 것임 = 그래서 70점짜리 코드

		int a = 0;
		for(int i = 3; i<=100; i=i+3) {
			a = a + i;	
		}
		System.out.println("a 값:" + a);

		
		
		
		// 밑에 이런 류로 많이 씀!! 중요함 == 100점 짜리 코드 - for문은 이게 다임
		// db 최신화 sql에서 빼서 처리하는 보내는 문장? - 응용
		int sum3 = 0;
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0 ) {
				sum3 = sum3 + i;
			}
		}
		System.out.println("sum3 값:" + a);

	}
	

}