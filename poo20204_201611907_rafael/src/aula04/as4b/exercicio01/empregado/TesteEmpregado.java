package aula04.as4b.exercicio01.empregado;

import java.util.ArrayList;
import java.util.List;

public class TesteEmpregado {


	public static void main(String[] args) {
		List<Empregado> funcionar = new ArrayList<Empregado>();
		
		Endereco e1 = new Endereco("Rua Caiçara",160,"Qd.501",74762201,"Jardim Flores","Rio Verde","GO");
		Empresa b1 = new Empresa("000000","Banco Nubank S.A.",e1);
		Empregado p1 = new Empregado("Rafael Campos",213123,b1);

		Endereco e2 = new Endereco("Rua 26",23,"Qd.2893",74902201,"Jassana","Goiania","GO");
		Empresa b2 = new Empresa("202020","Danoninho",e2);
		Empregado p2 = new Empregado("Márcia Pereira",4536232,b2);
		
		Endereco e3 = new Endereco("Av. Putao",223,"",330775240,"Vila itatiaia","Nova Jersey","GO");
		Empresa b3 = new Empresa("50505050","Auvo Tecnologia",e3);
		Empregado p3 = new Empregado("Padre",432210,b3);

		funcionar.add(p1);
		funcionar.add(p2);
		funcionar.add(p3);
		
		System.out.println(funcionar.toString());
	}

}
