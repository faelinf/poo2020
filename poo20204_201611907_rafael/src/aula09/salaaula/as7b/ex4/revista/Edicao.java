package aula09.salaaula.as7b.ex4.revista;

public class Edicao extends Revista {
	
	private String assunto;
	
	public Edicao(String titulo, int ano, int numero, String assunto) {
		super(titulo, ano, numero);
		this.setAssunto(assunto);
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
