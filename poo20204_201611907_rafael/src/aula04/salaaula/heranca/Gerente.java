package aula04.salaaula.heranca;

public class Gerente extends Funcionario {
        public Gerente(String n, String c, double s){
            super(n, c, s);
        }


        public double calculaBonificacao(){
            double salario = this.getSalario();
            return salario *= 1.15;
        }
}
