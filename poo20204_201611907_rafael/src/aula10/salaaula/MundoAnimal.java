package aula10.salaaula;

import aula06.salaaula.endereco.Pais;

/**
 * Created by Alunoinf_2 on 30/01/2020.
 */
public class MundoAnimal {
    public static void main (String[] args){
        Animal[] reino = new Animal[3];
        reino[0] = new Anfibio("Salamandra");
        reino[1] = new Ave("Querubim");
        reino[2] = new Peixe("Dourado");

        int tamanhoVetor = reino.length;

        for (int i=0; i < tamanhoVetor; i++){
            if (reino[i] instanceof Peixe){
                ((Peixe) reino[i]).nadar();
            }else {
                reino[i].mover(10,10);
            }
        }

        /*
        for (Animal a : reino){
            a.mover(10,10);
        }
        */
    }
}
