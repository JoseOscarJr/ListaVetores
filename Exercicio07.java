package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		final int TAM1=10;
		final int TAM2=4;
		int cont=0;
		float[][] vetor = new float[TAM1][TAM2];
		float[] media = new float[TAM1];
		
		System.out.println("Insira notas: ");
		
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				System.out.println("Insira a nota "+(j+1)+" do aluno "+(i+1));
				vetor[i][j] = ler.nextFloat();
			}
		}
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				if(j==0)
					media[i] = 0;
				
				media[i] = media[i] + vetor[i][j];
			}
		}
		for (int i = 0; i < media.length; i++) {
			media[i] = media[i] / TAM2;
			if(media[i] >= 7)
				cont++;
		}
		System.out.println("O numero de alunos com media igual ou superior a 7 e: "+cont);
	
		ler.close();

	}

}
