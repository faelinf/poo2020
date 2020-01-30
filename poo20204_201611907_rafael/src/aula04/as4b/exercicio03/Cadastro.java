package aula04.as4b.exercicio03;

import java.text.DecimalFormat;

public class Cadastro {


	public static void main(String[] args) {
		DecimalFormat dc = new DecimalFormat("#,###.00");
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(2500);
		f1.setHorario("08:00 - 18:00");
		f1.setTelefone("98114-6666");
		f1.aumento(10);
		double recebimento = f1.receb(f1.getSalario());
		System.out.print("Funcionario: " + "\nHorario: " + f1.getHorario());
		System.out.println("\nSalario: " + f1.getSalario() + "\nTelefone: " + f1.getTelefone());
		System.out.println("Recebe por ano: " + dc.format(recebimento));
	
		Gerente g1 = new Gerente();
		
		g1.setSalario(6000);
		g1.setTipo("GP");
		g1.setTelefone("99742-3864");
		g1.setBonificacao(100);
		g1.aumento(10);
		recebimento = g1.receb(g1.getSalario());
		
		System.out.print("\n\nGerente: " + "\nTipo: " + g1.getTipo());
		System.out.println("\nSalario: " + g1.getSalario1() + "\nTelefone: " + g1.getTelefone());
		System.out.println("Bonificacao: " + g1.getBonificacao() + "\nRecebimento anual: " + dc.format(recebimento)+"\n");
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Rafael");
		c1.setTelefone("96835-0436");
		c1.setIdade(32);
		c1.setCpf("545-4321-13434-01");
		c1.setStatus("A");
		
		Cliente c2 = new Cliente();
		
		c2.setNome("Juau");
		c2.setTelefone("3622-7655");
		c2.setIdade(26);
		c2.setCpf("656-8346-3223-02");
		c2.setStatus("E");
		
		Cliente c3 = new Cliente();
		
		c3.setNome("Padre");
		c3.setTelefone("8946-0106");
		c3.setIdade(21);
		c3.setCpf("987-5345-3293-11");
		c3.setStatus("E");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString() + "\n");
		
		c2.desativa(c2.getStatus());
		System.out.println(c2.toString());
	}

}
