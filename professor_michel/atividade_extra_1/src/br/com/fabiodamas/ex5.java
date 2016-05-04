package br.com.fabiodamas;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		int fatorial = 1;
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}

		System.out.println("Cálculo do Fatorial");
		System.out.println("!" + numero + " = " + fatorial);

	}
}