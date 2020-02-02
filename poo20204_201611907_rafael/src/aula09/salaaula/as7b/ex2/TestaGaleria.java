package aula09.salaaula.as7b.ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaGaleria {

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
		
		Artista a1 = new Artista("Da Vinci",formata("30/03/1853"),"Paises Baixos");
		Artista a2 = new Artista("Don Corleone",formata("25/08/1771"),"Espanha");
		Artista a3 = new Artista("Monet",formata("11/05/1804"),"Espanha");
		
		Obra o1 = new Obra("Auto-Retrato",71500000,formata("12/09/1889"),"Vendida","Quadro","leo,tinta",a1);
		Obra o2 = new Obra("Le Rove",155000000,formata("12/02/1932"),"Vendida","Quadro","leo,tinta",a2);
		Obra o3 = new Obra("Impressão, nascer do sol",0.0,formata("12/06/1931"),"disponivel","Quadro",
							"Bronze, Tinta a oleo",a3);
		
		g.setObras(o1);
		g.setObras(o2);
		g.setObras(o3);
		
		g.imprimiObra(g.getObras());
		
	}

}
