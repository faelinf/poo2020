package AtividadeLista1.poo;
import java.util.Scanner;
	
public class ExercicioCinco {
	
	public static void main(String[]args){
	Scanner entrada = new Scanner(System.in);
	
	String nome, nomeM;
	double salario, maiorSalario, soma, media, i = 0;
	System.out.println("Nome do funcionário: ");
	nome = entrada.next();
	nomeM = nome;
	System.out.println("Informe o salário: ");
	salario = entrada.nextDouble();
	maiorSalario = salario;
	soma = salario;
	
		for (; i < 3; i++){
	
			System.out.println("Nome do funcionário: ");
	
			nome = entrada.next();
	
			System.out.println("Informe o salário: ");
	
			salario = entrada.nextDouble();
	
			if (salario > maiorSalario)
	
				maiorSalario = salario;
				nomeM = nome;            	
				soma = soma + salario;
	
		}
	
			media = soma / i;
	
			System.out.println("O maior salário é: "+maiorSalario+" e é de: "+nomeM);
	
			System.out.println("Média de salários: "+media);
	
	 	}
	
	}