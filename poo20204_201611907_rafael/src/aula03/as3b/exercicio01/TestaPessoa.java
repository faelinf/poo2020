package aula03.as3b.exercicio01;

import java.util.Scanner;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = GregorianCalendar.getInstance();
		
		Pessoa p = new Pessoa();
		int[] date = new int[3];
		int idade = 0;
		
		System.out.println("Digite o seu nome");
		p.setNome(sc.nextLine());
		
		
		System.out.println("Quando vc nasceu ?\nDia:");
		date[0] = sc.nextInt();
		System.out.println("O Mes: ");
		date[1] = sc.nextInt();
		System.out.println("O Ano: ");
		date[2] = sc.nextInt();
		
		p.setData(date);
		
		System.out.println("Digite a sua altura");
		p.setAltura(sc.nextDouble());
		
		idade = p.idade(date);
		 
		p.setIdade(idade);
	
	
		System.out.println(p.toString());
		

	}

}
