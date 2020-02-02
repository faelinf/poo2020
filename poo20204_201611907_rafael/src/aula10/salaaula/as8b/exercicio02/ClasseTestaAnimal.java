package aula10.salaaula.as8b.exercicio02;

public class ClasseTestaAnimal {
	public static void main(String[] args) {

		Animal cavalo = new Cavalo("PAULIN", 12);

		Animal cachorro = new Cachorro("Pandora", 8);

		Animal preguica = new Preguica("Kuka Beludo", 10);

		cavalo.emitirSom();
		cachorro.emitirSom();
		preguica.emitirSom();

	}

}
