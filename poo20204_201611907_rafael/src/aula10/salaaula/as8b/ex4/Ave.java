package aula10.salaaula.as8b.ex4;

public class Ave extends Animal {

	public Ave(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da Ave\n");

	}

	@Override
	public void mover() {
		System.out.println("Ave voando alto!\n");

	}

}
