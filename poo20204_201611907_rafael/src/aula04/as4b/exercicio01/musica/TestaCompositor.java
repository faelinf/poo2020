package aula04.as4b.exercicio01.musica;

import java.util.ArrayList;
import java.util.List;

public class TestaCompositor {

	public static void main(String[] args) {
		
		List<Musica> musicas = new ArrayList<Musica>();
		
		Compositor c1 = new Compositor("Mozart","italiano");
		Musica ms1 = new Musica("Opera",2017,"Clássica",c1);
		
		Compositor c2 = new Compositor("Mc livinho","brasilian");
		Musica ms2 = new Musica("Meu bem querer",2018,"funk",c2);

		Compositor c3 = new Compositor("Gusttavo lima","brasileiro");
		Musica ms3 = new Musica("Aaaaai bb",2019,"sertanejo",c3);

		musicas.add(ms1);
		musicas.add(ms2);
		musicas.add(ms3);
		System.out.println(musicas.toString() );

	}

}
