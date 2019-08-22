package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TAM = 5;
		int cont = 0;
		char[] produto = new char[TAM]; 
		
		for (int i = 0; i < produto.length; i++) {
			System.out.print("Informe o "+i+"° char: ");
			produto[i] = ler.next().charAt(0);
			
			if((produto[i] != 97 )&&( produto[i] != 101) && ( produto[i] != 105) && (produto[i] != 111) && (produto[i] != 117)) {
				cont++;
			}
		}
		for (int i = 0; i < produto.length; i++) {
			if((produto[i] != 97 )&&( produto[i] != 101) && ( produto[i] != 105) && (produto[i] != 111) && (produto[i] != 117)) {
				System.out.println("char "+ produto[i]);
			}
			
		}
		System.out.println("Tem "+ cont+ "consoantes");
		ler.close();

	}

}
