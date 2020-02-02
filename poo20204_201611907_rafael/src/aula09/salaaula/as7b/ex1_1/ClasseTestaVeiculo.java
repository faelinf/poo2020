package aula09.salaaula.as7b.ex1_1;

public class ClasseTestaVeiculo {
	public static void main(String[] args) {

		Empregado e1 = new Empregado("JK","12456","Rafael Campos",22);
		Veiculo v1 = new Veiculo("GO",5664,e1);
		

		v1.setPlaca(3280);
		e1.setIdade(22);
		

		v1.imprimir();
		e1.imprimir();
	}
}
