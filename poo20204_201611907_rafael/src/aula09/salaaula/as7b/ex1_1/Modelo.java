package aula09.salaaula.as7b.ex1_1;

public abstract class Modelo {
	private String tituloDoProjeto;
	
	public Modelo(String tituloDoProjeto) {
		this.tituloDoProjeto = tituloDoProjeto;
	}
	
	public String getTitulo() {
		return tituloDoProjeto;
	}

	public void setTitulo(String tituloDoProjeto) {
		this.tituloDoProjeto = tituloDoProjeto;
	}
	
	public abstract void imprimir();
	
	

	public String toString() {
		return null;
	}
}
