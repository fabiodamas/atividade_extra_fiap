package br.com.fabiodamas;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		int fatorial = 1;
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}

		System.out.println("C�lculo do Fatorial");
		System.out.println("!" + numero + " = " + fatorial);

	}
}