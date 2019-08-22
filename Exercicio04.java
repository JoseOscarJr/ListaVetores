package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 4;
		double soma = 0;
		double[] produto = new double[TAM]; 
		
		for (int i = 0; i < produto.length; i++) {
			System.out.print("Informe o "+(i+1)+"° nota: ");
			produto[i] = ler.nextInt();
			soma += produto[i];
		}
		for (int i = 0; i < produto.length; i++) {
			System.out.println((i+1)+"° nota "+ produto[i]);
		}
		System.out.println("Media: "+ soma/TAM);
		ler.close();

	}

}
