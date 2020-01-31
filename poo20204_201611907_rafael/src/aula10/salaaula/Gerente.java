package aula10.salaaula;

/**
 * Created by Alunoinf_2 on 30/01/2020.
 */
public class Gerente extends Funcionario{
    private int senha;
    public double bonificacao(){
        double b = salario * 0.15;
        return b;
    }
}

