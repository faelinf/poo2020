package aula10.salaaula.as8b.ex4;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som do cachorro");

	}

	@Override
	public void mover() {
		System.out.println("Cachorro voando!\n");

	}
	
	public void correr() {
		mover();
	}

}
