package Controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a nota : ");
		double nota = entrada.nextDouble();
		
		if(nota >10 || nota <0) {
			System.out.println("Nota invalida!");
		}else if (nota >= 8.1) {
			System.out.println("Conceito A");
			System.out.println("Meus parabens!!");
		}else if (nota >= 6.1) {
			System.out.println("Conceito B");
			System.out.println("Esta na media");
		}else if (nota >= 4.1) {
			System.out.println("Conceito C");
			System.out.println("Tem que se esforcar mais!! Cuidado!");
		}else if (nota >= 2.1) {
			System.out.println("Conceito D");
			System.out.println("muito ruim, se esforce, cuidado!!!");
		}else {
			System.out.println("Conceito E");
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}

}
