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
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� N�mero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� N�mero"));

		JOptionPane.showMessageDialog(null, "Total soma: " + soma(a,b) + "\nTotal Subtra��o: " + subtracao(a,b) + "\nTotal Multipiplica��o: " + multiplicacao(a,b) + "\nTotal Divis�o: "
				+ "" + divisao(a,b));
	}

}
