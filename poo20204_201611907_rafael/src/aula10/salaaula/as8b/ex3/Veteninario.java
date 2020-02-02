package aula10.salaaula.as8b.ex3;

// Exercicio 3 
public class Veteninario {	
	
	public void examinar(Animal animal) {
		System.out.println("Analisando " + animal.getClass().getSimpleName());
		
		animal.emitirSom();
	}
	
	
}
