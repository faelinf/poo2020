package aula10.salaaula.as8b.ex4;

public class Gurila extends Animal {

	public Gurila(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da gurila");
	}

	@Override
	public void mover() {
		System.out.println("Gurila gritando!\n");

	}
	
	public void correr() {
		mover();
	}

}
