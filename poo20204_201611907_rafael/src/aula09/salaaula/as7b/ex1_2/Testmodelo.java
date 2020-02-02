package aula09.salaaula.as7b.ex1_2;

public class Testmodelo {
	public static void main(String[] args) {
		Empregado e1 = new Empregado("987654","RAFAEL CAMPOS",32);
		Veiculo v1 = new Veiculo(5671,e1);
		
		v1.setPlaca(3280);
		e1.setIdade(22);
		
		v1.imprimir();
		e1.imprimir();
	} 
}
