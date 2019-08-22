package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 20;
		int contIm = 0;
		int contPa = 0;
		int[] produto = new int[TAM]; 
		
		for (int i = 0; i < produto.length; i++) {
			System.out.print("Informe o "+i+"° char: ");
			produto[i] = ler.nextInt();
			
			if(produto[i] % 2 == 0) {
				contPa++;
			}else {
				contIm++;
			}
		}
		int[] impar = new int[contIm];
		int[] par = new int[contPa];
		contIm = 0;
		contPa = 0;
		for (int i = 0; i < produto.length; i++) {
			if(produto[i] % 2 == 0) {
				par[contPa] = produto[i];
				contPa++;
			}else {
				impar[contIm] = produto[i];
				contIm++;
			}
		}
		for (int i = 0; i < par.length; i++) {
			System.out.println("Par "+ par[i]);
		}
		for (int i = 0; i < impar.length; i++) {
			System.out.println("Impar "+ impar[i]);
		}
		ler.close();
	}

}
