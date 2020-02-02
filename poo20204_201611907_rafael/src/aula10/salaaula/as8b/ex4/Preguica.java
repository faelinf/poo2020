package aula10.salaaula.as8b.ex4;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom() {
		System.out.println("O som da preguiça\n");

	}

	@Override
	public void mover() {
		System.out.println("Preguiça subindo devagar!\n");

	}

}
