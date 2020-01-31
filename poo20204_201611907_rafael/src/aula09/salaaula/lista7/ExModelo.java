package aula09.salaaula.lista7;

public abstract class ExModelo {
    private String tituloDoProjeto;

    public ExModelo(String tituloDoProjeto) {
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
