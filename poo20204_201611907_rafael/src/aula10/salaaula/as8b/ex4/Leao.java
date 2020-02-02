package aula10.salaaula.as8b.ex4;

public class Leao extends Animal {

	public Leao(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som do Leao");

	}

	@Override
	public void mover() {
		System.out.println("Leão rugindo!\n");

	}
	
	public void correr() {
		mover();
	}

}
