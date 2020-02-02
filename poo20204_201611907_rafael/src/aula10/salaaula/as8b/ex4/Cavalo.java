package aula10.salaaula.as8b.ex4;

public class Cavalo extends Animal {
	

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

	public void emitirSom() {
		System.out.println("O som do cavalo");

	}

	@Override
	public void mover() {
		System.out.println("Cavalo cavalgando!\n");

	}
	
	public void correr() {
		mover();
	}
}
