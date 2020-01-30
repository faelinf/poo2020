package aula04.as4b.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionario = new ArrayList<Funcionario>();
		
		int matricula = 0;
		int i = 0 ;
		
		Funcionario[] f = new Funcionario[10];
		Endereco[] e = new Endereco[10];
		System.out.println("Digite a Matricula do funcionario:");
		matricula = sc.nextInt();
		if(matricula == 0)
			System.out.println("\nNinguem cadastrado!");
		else {	
			while(matricula!=0) {
				f[i] = new Funcionario();
				e[i] = new Endereco();
				f[i].setMatricula(matricula);
				System.out.println("Digite o cpf:");
				f[i].setCpf(sc.next());
				sc.nextLine();
				System.out.println("Digite o Nome:");
				f[i].setNome(sc.nextLine());
				System.out.println("Digite o cargo:");
				f[i].setCargo(sc.nextLine());
				System.out.print("Digite o salario:  ");
				f[i].setSalario(sc.nextDouble());
				sc.nextLine();
				System.out.println("\nDigite o departamento:");
				f[i].setDepartamento(sc.nextLine());
				System.out.println("\nDigite o endereco:");
				System.out.print("Digite a Rua: ");
				e[i].setRua(sc.nextLine());
				System.out.print("Digite o Numero: ");
				e[i].setNumero(sc.nextInt());
				System.out.print("Digite a Quadra: ");
				e[i].setQuadra(sc.nextInt());
				System.out.print("Digite o Lote: ");
				e[i].setLote(sc.nextInt());
				sc.nextLine();
				System.out.print("Digite o Complemento: ");
				e[i].setComplemento(sc.nextLine());
				System.out.print("Digite o Bairro: ");
				e[i].setBairro(sc.nextLine());
				System.out.print("Digite a Cidade: ");
				e[i].setCidade(sc.nextLine());
				System.out.print("Digite o Estado: ");
				e[i].setEstado(sc.nextLine());
				f[i].setEndereco(e[i]);
				funcionario.add(f[i]);
				i++;
				System.out.println("\nDigite a nova matricula ou digite 0 para sair do programa");
				matricula = sc.nextInt();
			}
			System.out.println(funcionario.toString());
			for(int k = 0; k < i; k++) 
				f[k].aumenta(f[k].getSalario());
			System.out.println("\n\nSalario modificado para cima");
			System.out.println(funcionario.toString());
		}
		
	}
}
