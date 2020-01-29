package aula03.lista03;
import java.util.Date;

public class TestaExUm {


        public static void main(String[] args){
            ClasseExercicioUM p = new ClasseExercicioUM();

            p.setNome("Rafael");
            p.setDataNascimento(new Date());
            p.setAltura(1.80f);

            System.out.println("Os dados da pessoa: " + p.getNome());
            System.out.println("Data de nascimento da pessoa " + p.getDataNascimento());
            System.out.println("Altura da pessoa: " + p.getAltura());

        }


}
