package aula10.salaaula.as8b.ex4;

public class Tigre extends Animal {

	public Tigre(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		System.out.println("O som do Tigre");

	}

	@Override
	public void mover() {
		System.out.println("Tigre urringindo!\n");

	}
	
	public void correr() {
		mover();
	}

}
