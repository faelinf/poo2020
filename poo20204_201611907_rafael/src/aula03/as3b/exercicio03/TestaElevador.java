package aula03.as3b.exercicio03;

import java.util.Scanner;

public class TestaElevador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Elevador elevador = new Elevador(15,20);
		
		int pessoas = 0;
		elevador.inicia(20, 15);
		

		System.out.println("\nDigite uma opcao:");
		System.out.println("(1) Entrou alguem\n(2) Saiu alguem\n(3) Subiu\n(4) Desceu");
		int option = sc.nextInt();
		
		do {
			switch(option) {
			case 1:
				System.out.println("Digite a quantidade de pessoas");
				pessoas = sc.nextInt();
				elevador.entra(pessoas);
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descricao");
				break;
			case 2:
				System.out.println("Digite a quantidade de pessoas");
				pessoas = sc.nextInt();
				elevador.sai(pessoas);
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descricao");
				break;
			case 3 :
				elevador.sobe();
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descricao");
				break;
			case 4:
				elevador.desce();
				elevador.status();
				System.out.println("\n(1)(2)(3)(4)(5)\n(0)-Para descricao");
				break;	
			case 0: 
				System.out.println("\nSelecione uma opcao:");
				System.out.println("(1) Entrou pessoas\n(2) Saiu pessoas\n(3) Subiu\n(4) Desceu\n(5) Encerrar");
				break;

			}

			option = sc.nextInt();
		}while(option !=5);
		System.out.println("\nElevador Inativo\n");
	}
}
