package java_ch04_240510;

public class While_test_01 {

	public static void main(String[] args) {
		// 참이면 계속 돌아가는 것, 거짓이면 안돌아가고 다른 줄로 넘어감
		int i=1;
		while (i<=100) { //while 괄호 조건 중괄호
			System.out.println("조건1:"+i); // 조건 위치 중요
			i++;
			System.out.println("조건2:"+i); // 조건 위치 중요
		}
		
		int j = 1;
		while(true) {//무한루프 형태
			j++;
			System.out.println("조건3:"+j); // 조건 위치 중요
			// 멈추기 위해서 if break 문을 씀
			if (j == 100) {
				break;
			}

		}
		
		do { // 사실 잘 안씀 - 장점은 있음 - do while 문으로 만듦 - 쓸일이 그렇게 많지는 않음
			System.out.println("안녕!"); // 조건 위치 중요 // 한번은 실행하게 하고 다음 조건을 봄
		} while(false);
		
		
		// 이중포문으로 해서 continue문을 만나면 처음조건으로 돌아가는 그런 느낌임
		// continue는 잘 안쓰는 것이 좋음, 그러나 알아두고 있어야함 - 코드가 꼬이기 쉬움 == 스파게티 코드	
		
		for (int k=1; k<=10; k++) {  // 1 2 4 5 7 8 10 == 3의 배수만 빠졌음
			if (k % 3 == 0) {
				continue;
			} // if 참이니까 다시 위로 올라감 -- 거짓일 경우 k를 찍음
			System.out.println(k);
		}
	}
}
