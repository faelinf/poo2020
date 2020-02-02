package aula10.salaaula.as8b.ex4;

public class TestAnimal {
	public static void main(String[] args) {

		Animal cavalo = new Cavalo("Pandora", 12);

		Animal preguica = new Preguica("Paulota", 10);

		Animal cachorroSelvagem = new Cachorro("Xeiq", 8);

		Animal zebra = new Zebra("KUKA", 12);

		Animal gurila = new Gurila("pedro", 8);

		Animal periquito = new Ave("peba", 6);

		Animal leao = new Leao("Lilica", 12);

		Animal tigre = new Tigre("Jipo", 5);

		Animal cobra = new Cobra("Caoncada", 2);

		Animal macaco = new Macaco("Cego", 3);

		Zoologico zoo = new Zoologico();

		zoo.jaula[0] = cavalo;
		zoo.jaula[1] = cachorroSelvagem;
		zoo.jaula[2] = zebra;
		zoo.jaula[3] = gurila;
		zoo.jaula[4] = periquito;
		zoo.jaula[5] = leao;
		zoo.jaula[6] = tigre;
		zoo.jaula[7] = cobra;
		zoo.jaula[8] = macaco;
		zoo.jaula[9] = preguica;

		System.out.println("\nZoológico:\n");
		for (int i = 0; i < 10; i++) {
			System.out.println("Passando pela jaula " + (i + 1));
			if (zoo.jaula[i] instanceof Animal) {
				((Animal) zoo.jaula[i]).emitirSom();
				((Animal) zoo.jaula[i]).correr();
			}
		}
	}

}
