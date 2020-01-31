package aula10.salaaula;

/**
 * Created by Alunoinf_2 on 30/01/2020.
 */
public class TesteHeranca {
    public static void main(String [] args){
        Gerente g = new Gerente();
        g.setSalario(3000);
        System.out.println("A bonificacao é: " +
                g.bonificacao());
    }
}