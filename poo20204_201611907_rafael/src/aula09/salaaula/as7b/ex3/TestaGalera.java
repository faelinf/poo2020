package aula09.salaaula.as7b.ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaGalera {

	private static Date formata(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
		Date dataf = null;
		try {
			dataf = formato.parse(data);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataf;
	}

	public static void main(String[] args) {
		
		Galeria g = new Galeria();

		Obra o1 = new Obra("Auto-Retrato",71500000,formata("12/09/1889"),"Disponível","Quadro","Óleo,tinta","Vicent Van Gogh");
		Obra o2 = new Obra("Le Rêve",155000000,formata("12/02/1932"),"Disponível","Quadro","Óleo,tinta","Pablo Picasso");
		Obra o3 = new Obra("A Persistência da Memória",200000000,formata("12/06/1931"),"disponível","Quadro","Bronze, Tinta a Óleo","Salvador Dalí");
		
		Cliente c1 = new Cliente("Rafael Campos","3280-2134","703.304.789-02");
		Cliente c2 = new Cliente("Laiser Ribeiro","7894-2134","548.444.554-12");
		
		Venda v1 = new Venda(c1,o3,formata("19/10/2020"));
		Venda v2 = new Venda(c2,o1,formata("23/11/2020"));
		g.cadastraVenda(v1);
		g.cadastraVenda(v2);
	
		
		g.imprimiVenda(g.getVenda());

	}

}
