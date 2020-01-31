package aula09.salaaula.lista7;


public class Veiculo extends ExModelo {

    private int placa;
    private ExEmpregado responsavel;

    public Veiculo(String tituloDoProjeto, int placa, ExEmpregado responsavel) {
        super(tituloDoProjeto);
        this.responsavel = responsavel;
    }

    public ExEmpregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ExEmpregado responsavel) {
        this.responsavel = responsavel;
    }

    public String toString() {
        StringBuffer sc = new StringBuffer();
        sc.append("\nNome do projeto: " + this.getTitulo());
        sc.append("\nPlaca: " + this.getPlaca());
        sc.append("\nResponsável do projeto: " + this.getResponsavel().getNome() + ", "
                + this.getResponsavel().getIdade() + " anos");
        sc.append(" | Número do Código: " + this.getResponsavel().getCodigo());
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
