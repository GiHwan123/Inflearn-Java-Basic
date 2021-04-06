package lec01;

public class Veriable02 {

	public static void main(String[] args) {
		
		int intAmount = 10;//프로그래밍 작업에서 변수의 초기화는 굉장히 중요한 작업
		int a=1;
		int b=2; // 이런식으로 아무런 의미없는 변수명을 선언해주는것은 굉장히 좋지않은 습관임. 항상 의미가 있는 변수명을 선언해야함
		int firstValue =10;
		int SecondValue = 2;
		int sumValue=0;
		
		sumValue = firstValue + SecondValue;
		sumValue = firstValue + SecondValue;
		System.out.println(sumValue);
		/*변수명 짓는 방법
		 * 1. 대소문자 구분되며 길이의 제한이 없어야 한다.
		 * 2. 예약어 사용하면 안된다.
		 * 3. 숫자로 시작하면 안된다.
		 * 4. 특수문자는 _와 $만 허용한다.
		 * 
		 * 1. 낙타등 표기법(단어를 대문자로 끊어치는 방법 ex- bankAccount,companyName)
		 * 2. 연관된 단어로 조합
		 * 3. companyName,HumanResource(인사) 등 의미있는 변수명을 짓는것이 필수적임.
		 * 
		 * */
		String BankAccount="110-424-033024";
		int depositMoney=100000;
		
	}
}
