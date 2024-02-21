package Controle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.print("Informe a media: ");
		double media = entrada.nextDouble();
		
		boolean valoraprovação = media <=10 && media >= 7;
		boolean valorrecuperacao = media < 7 && media >-4.5;
		boolean valorreprovado = media <4.5 && media >=0;
		
		if(valoraprovação) {
			System.out.println("Aprovado!");
			System.out.println("Parabens!!!");
		}
		
		if (valorrecuperacao) {
			System.out.println("Em recuperacao");
		}
		
		if (valorreprovado) {
			System.out.println("Reprovvado");
			System.out.println("Deveria ter se esforçado mais");
		}
		
		entrada.close();
	
	}
}
