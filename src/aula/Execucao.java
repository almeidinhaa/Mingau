package aula;

public class Execucao {

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

		System.out.println("Total:" + soma(10,8));
		System.out.println("Total:" + subtracao(10,8));
		System.out.println("Total:" + multiplicacao(10,8));
		System.out.println("Total:" + divisao(10,8));
	}

}
