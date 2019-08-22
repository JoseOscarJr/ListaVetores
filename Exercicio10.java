package listaExercicioVetor;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 

		String texto= " ";
		
		System.out.println("Insira um texto: ");
		texto = ler.next();
		
		char b[] = texto.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
	
		}
		ler.close();
	}

	}

}
