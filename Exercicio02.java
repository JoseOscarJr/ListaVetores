package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 10;
		int[] produto = new int[TAM]; 
		
		for (int i = 0; i < produto.length; i++) {
			System.out.print("Informe o "+i+"° numero: ");
			produto[i] = ler.nextInt();
		}
		for (int i = produto.length-1; i > (-1); i--) {
			System.out.println(i+"° numero "+ produto[i]);
		}
		ler.close();
	}

}
