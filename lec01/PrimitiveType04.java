package lec01;

public class PrimitiveType04 {

	//주석을 통해 비즈니스 로직으로 막아놓기도 함
	public static void main(String[] args) {
		
		boolean isTrue = false;
		
		char oneChar = '가';
		char twoChar = '나';
		
		byte firstByte 		= 1;
		byte secondByte 	= 2;
		int thirdInt 		= 3;
		long fourthLong 	= 4;
		
		int frontData =2;
		int backData =3;
		int multipleData = frontData * backData;
		System.out.println("multipleData :::" + multipleData);
		
		int intA=0;
		long longB=201;
		//int intAlongB=intA + longB;//10L의 물통(int)과 20L의 물통(long)의 합 부피를 10L의 물통(int)에 담는것과 같은 이치이기때문에 오류발생
		long longBintA=intA + longB;// long의 자료형이 더 크기때문에 이 경우는 가능
		
		float floatA=10.1f;
		double doubleB=20.35678;//실수형은 float보단 double을 주로 많이사용함
		double floatAB = floatA + doubleB;
		System.out.println(doubleB);
		System.out.println(floatAB);
		
		int accountDocumentCount = 10;
		int humanResourceDocumentCount = 20;
		int procureDocumentCount = 5;
		int productionDocumentCount = 15;
		int salesDocumentCount = 25;
		
		int totalDailyDocumentCount = accountDocumentCount + humanResourceDocumentCount + 
		procureDocumentCount + productionDocumentCount + salesDocumentCount;
		
		System.out.println("일일 부서 문서 생산량 :::" + totalDailyDocumentCount);
	}
}
