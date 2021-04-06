package lec01;

import java.util.ArrayList;

public class Array05 {

	public static void main(String[] args) {
		
		int [] arrA = new int[] {1,2,3,4,5};
		int [] arrB = new int[5];
		arrB[0]=1;
		arrB[1]=2;
		arrB[2]=3;
		arrB[3]=4;
		arrB[4]=5;
		
		ArrayList<Integer> sampleIntlist = new ArrayList<Integer>();
		sampleIntlist.add(1);
		sampleIntlist.add(2);
		System.out.println(arrA[0]);
		System.out.println(arrB[0]);
		System.out.println(sampleIntlist);
		
	}
}
