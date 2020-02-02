package aula10.salaaula.as8b.ex3;

public class ClasseTestaAnimal {
	public static void main(String[] args) {

		// Exercicio 2
		Animal cavalo = new Cavalo("Pandora", 12);

		Animal cachorro = new Cachorro("Kuka", 8);

		Animal preguica = new Preguica("Paulin", 10);

		Veteninario vet = new Veteninario();

		vet.examinar(preguica);

		vet.examinar(cachorro);

		vet.examinar(cavalo);

	}

}
