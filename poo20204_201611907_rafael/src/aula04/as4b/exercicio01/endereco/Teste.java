package aula04.as4b.exercicio01.endereco;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	Endereco e1 = new Endereco("Rua Caiçara",110,"Qd.70",75902201,"Jardim dos Palmares","Buzios","GO");
	Cliente c1 = new Cliente("Rafael Campos","70393687147",e1);
	
	Endereco e2 = new Endereco("Rua 26",23,"Qd.231",77552201,"Goyanazes","Goiania","GO");
	Cliente c2 = new Cliente("Juaquin","72109076187",e2);
	
	Endereco e3 = new Endereco("Av. Chicy",263,"",333935240,"Vila madalena","Campo Belo","MG");
	Cliente c3 = new Cliente("Joao pinto","6029302192",e3);

	clientes.add(c1);
	clientes.add(c2);
	clientes.add(c3);
	
	System.out.println(clientes.toString());
	}
}

