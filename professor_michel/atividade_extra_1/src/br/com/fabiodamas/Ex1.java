package br.com.fabiodamas;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] intA = new int [3];
		int [] intB = new int [3];	
		int j=0;
		
		intA[0]=4;
		intA[1]=2;
		intA[2]=3;
		
		for (int i = intA.length-1; i >= 0 ; i--) {
			intB[j] = intA[i];
			j++;
		}
		
		for (int i = 0 ; i < intB.length ; i++) {
			System.out.println(intB[i]);
		}
		
	}

}
