package aula;

import javax.swing.JOptionPane;

public class Execucao3 {

	public static int soma (int x, int y) {
		return x + y;
	}
	
	public static int subtracao (int x, int y) {
		return x - y;
	}
	
	public static int multiplicacao (int x, int y) {
		return x * y;
	}
	
	public static int divisao (int x, int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° Número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° Número"));

		JOptionPane.showMessageDialog(null, "Total soma: " + soma(a,b) + "\nTotal Subtração: " + subtracao(a,b) + "\nTotal Multipiplicação: " + multiplicacao(a,b) + "\nTotal Divisão: "
				+ "" + divisao(a,b));
	}

}
