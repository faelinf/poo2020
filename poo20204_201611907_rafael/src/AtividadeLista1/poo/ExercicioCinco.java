package AtividadeLista1.poo;
import java.util.Scanner;
	
public class ExercicioCinco {

	public static void main(String[]args){
	Scanner entrada = new Scanner(System.in);
	
	String nome, nomeM;
	double salario, maiorSalario, soma, media, i = 0;
	System.out.println("Nome do funcionario: ");
	nome = entrada.next();
	nomeM = nome;
	System.out.println("Informe o salario: ");
	salario = entrada.nextDouble();
	maiorSalario = salario;
	soma = salario;
	
		for (; i < 3; i++){
	
			System.out.println("Nome do funcionario: ");
	
			nome = entrada.next();
	
			System.out.println("Informe o salario: ");
	
			salario = entrada.nextDouble();
	
			if (salario > maiorSalario)
	
				maiorSalario = salario;
				nomeM = nome;            	
				soma = soma + salario;
	
		}
	
			media = soma / i;
	
			System.out.println("O maior salario : "+maiorSalario+" e de: "+nomeM);
	
			System.out.println("Media de salarios: "+media);
	
	 	}
	
	}