package aula;

import javax.swing.JOptionPane;

public class Execucao4 {

	public static String parOuImpar(int i) {
		String b;
		
		if( i % 2 == 0) {
			b = "par";
		}
		else {
			b = "impar";
		}
		return b;
	}
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		JOptionPane.showMessageDialog(null, "O n�mero " + a + " � " + parOuImpar(a));
	}
	
}
