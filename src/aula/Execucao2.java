package aula;

import javax.swing.JOptionPane;

public class Execucao2 {

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

		
		System.out.println("total: " + soma(a,b));
		System.out.println("total: " + subtracao(a,b));
		System.out.println("total: " + multiplicacao(a,b));
		System.out.println("total: " + divisao(a,b));
	}

}
