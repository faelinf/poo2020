package aula02.ex2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Impostos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		Custo car = new Custo();
		
		double distribuidor = 0.28;
		double imposto = 0.45;
		
		System.out.println("Custo de f�brica :");
		car.custo = sc.nextDouble();
		
		double tot = (car.custo * distribuidor) + (car.custo * imposto) + car.custo; 
		
		System.out.println("O custo total do carro � R$ " + df.format(tot));
		
	}
}	
