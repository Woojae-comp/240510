package java_ch04_240510;

public class Double_for {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) { // i = 0부터 시작하는 것임 5번회전 index 번호로 할 때는 이렇게 함

		}
		for(int i=0; i < 5; i++) { // i = 1부터 시작하는 것임 5번회전
			System.out.println("안녕" + i);
			for(int j = 0; j<2; j++) { // j = 0, 1 2번회전
				System.out.println("안녕" + j);
			}
		}
// 구구단 원리는 알아둬야함
		for(int i=2; i<=9; i++) {
			System.out.println("------------------------------");
			for(int j=1; j<=9 ; j++ ) {
				System.out.println(i+ " * " + j + " = " + (i * j));

			}
		} // 복잡한 프로그램 만드는 것이 아니면 그렇게까지는 필요 없으나, 알아두는 것이 좋을 것 같음
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}