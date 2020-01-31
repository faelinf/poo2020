package aula10.salaaula;

/**
 * Created by Alunoinf_2 on 30/01/2020.
 */
public class Teste {

    public static void apresentar (Animal a){
        System.out.println(a.getNome());
        a.mover(10,10);
    }

    public static void main (String[] args){
        Object[] lista = new Object[3];

        lista[0] = new Anfibio("Salamandra");
        lista[1] = new Ave("Querubim");
        lista[2] = new Peixe("Dourado");

        for (int i = 0; i < 3; i++){
            apresentar((Animal) lista[i]);
        }
    }
}
