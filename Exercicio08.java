package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int TAM=5;
		int[] vet = new int[TAM];
		int soma=0;
		int mult=1;
		
		System.out.println("Insira 5 n�meros inteiros: ");
		
		for (int i = 0; i < TAM; i++) {
			vet[i] = ler.nextInt();
			soma += vet[i];
			mult = mult * vet[i]; 
			
		}
		for (int i = 0; i < TAM; i++) {
		System.out.println(vet[i]);
		
		}
		System.out.println("A soma �: "+soma);
		System.out.println("A multiplica��o �: "+mult);
		
		ler.close();

	}

}
