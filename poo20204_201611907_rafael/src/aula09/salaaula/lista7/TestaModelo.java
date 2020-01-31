package aula09.salaaula.lista7;


 class Testamodelo {
    public static void main(String[] args) {
        ExEmpregado e1 = new ExEmpregado("ProjetoTeste","201611907","Rafael",22);
        Veiculo v1 = new Veiculo("PJ",5695,e1);

        v1.setPlaca(3280);
        e1.setIdade(22);

        v1.imprimir();
        e1.imprimir();
    }
}
