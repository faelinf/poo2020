package aula10.salaaula.as8b.ex4;

public class Zebra extends Animal {

	public Zebra(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da Zebra");

	}

	@Override
	public void mover() {
		System.out.println("Zebra voando!\n");

	}
	
	public void correr() {
		mover();
	}

}
