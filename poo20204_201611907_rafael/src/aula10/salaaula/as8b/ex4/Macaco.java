package aula10.salaaula.as8b.ex4;

public class Macaco extends Animal {

	public Macaco(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som do macaco");

	}

	@Override
	public void mover() {
		System.out.println("Macaco gritando!\n");

	}
	
	public void correr() {
		mover();
	}

}
