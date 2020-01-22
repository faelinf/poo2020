package aula04.salaaula.heranca;

/**
 * Created by Alunoinf_2 on 22/01/2020.
 */
public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario f =new Funcionario("Rafael", "102", 1000.d);

        Funcionario g =new Gerente("Antonio Junio", "172", 2000.d);

        System.out.println("Valor do Salario Funcionario sem bonificação: " + f.getSalario());
        System.out.println("Valor do Salario Funcionario com bonificação: " + f.calcularBonificacao());
        System.out.println("Valor do Salario gerente sem bonificação: " + f.getSalario());
        System.out.println("Valor do Salario gerente com bonificação: " + f.calcularBonificacao());


    }
}
