package aula10.salaaula;

/**
 * Created by Alunoinf_2 on 30/01/2020.
 */
public class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }

    public void nadar(){
        System.out.println("Sou um "+
        this.getClass().getSimpleName() + " e estou nadando");
    }

    public void mover(int x, int y) {
        setCoordenadas(x,y);
        System.out.println("Movimento do peixe");
    }


}
