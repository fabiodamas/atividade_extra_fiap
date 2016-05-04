package br.com.fabiodamas;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculo(2,2,"+"));
		System.out.println(calculo(2,2,"-"));
		System.out.println(calculo(2,2,"*"));
		System.out.println(calculo(2,2,"/"));
		
		System.out.println(calculo(10.2, 8.2, "+"));
		System.out.println(calculo(50.3, 0.3, "-"));
		System.out.println(calculo(2.2 , 2,   "*"));
		System.out.println(calculo(2.2 , 2.2 ,"/"));
		
		
		
	}
	
	static int  calculo(int operador1, int operador2, String operacao){
		switch (operacao) {
		case "+":
			return operador1 + operador2;
		case "-":
			return operador1 - operador2;
		case "*":
			return operador1 * operador2;
		case "/":
			return operador1 / operador2;
		default:
			return 0;
		}
	}
	
	static double  calculo(double operador1, double operador2, String operacao){
		switch (operacao) {
		case "+":
			return operador1 + operador2;
		case "-":
			return operador1 - operador2;
		case "*":
			return operador1 * operador2;
		case "/":
			return operador1 / operador2;
		default:
			return 0;
		}
	}
	

	
	
}
