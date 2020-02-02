package aula09.salaaula.as7b.ex1_1;


public class Veiculo extends aula09.salaaula.as7b.ex1_1.Modelo {

	private int placa;
	private Empregado responsavel;
	
	public Veiculo(String tituloDoProjeto, int placa, Empregado responsavel) {
		super(tituloDoProjeto);
		this.responsavel = responsavel;
	}
	
	public Empregado getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Empregado responsavel) {
		this.responsavel = responsavel;
	}

	public String toString() {
 		StringBuffer sc = new StringBuffer();
 		sc.append("\nNome do projeto: " + this.getTitulo());
 		sc.append("\nPlaca: " + this.getPlaca());
 		sc.append("\nResponsavel: " + this.getResponsavel().getNome() + ", "
 		+ this.getResponsavel().getIdade() + " anos de idade");
 		sc.append(" | Codigo: " + this.getResponsavel().getCodigo());
 		return sc.toString();
	}
	
	@Override
	public void imprimir() {
		System.out.println(toString());
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

}
