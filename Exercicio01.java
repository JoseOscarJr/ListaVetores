package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 5;
		int[] produto = new int[TAM]; 
		
		for (int i = 0; i < produto.length; i++) {
			System.out.print("Informe o "+i+"° numero: ");
			produto[i] = ler.nextInt();
		}
		for (int i = 0; i < produto.length; i++) {
			System.out.println(i+"° numero "+ produto[i]);
		}
		ler.close();
	}

}
