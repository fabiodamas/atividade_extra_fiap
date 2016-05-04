package br.com.fabiodamas;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdSalarios;
		double total, media;
		
		qtdSalarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Salarios"));
		
		double[] salarios = new double[qtdSalarios];
		
		total = 0;
		for (int i = 0; i < salarios.length; i++) {
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário"));
			total = total + salarios[i] ; 
		}
		
		media = total / (salarios.length);
		System.out.println(media);
	}

}
