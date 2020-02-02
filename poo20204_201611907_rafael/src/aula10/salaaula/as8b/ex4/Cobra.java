package aula10.salaaula.as8b.ex4;

public class Cobra extends Animal {

	public Cobra(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da cobra\n");

	}

	@Override
	public void mover() {
		System.out.println("Cobra picando!\n");

	}

}
