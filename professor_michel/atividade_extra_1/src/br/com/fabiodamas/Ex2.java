package br.com.fabiodamas;

public class Ex2 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		c = 1;
		b = 2;
		for (a = 1; a <= b; a++) {
			c++;
			if (c == 2) {
				continue;
			}
			c--;
		}
		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
	}
}