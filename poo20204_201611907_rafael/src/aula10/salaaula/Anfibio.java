package aula10.salaaula;

/**
 * Created by Alunoinf_2 on 30/01/2020.
 */
     class Anfibio extends Animal {
    public Anfibio(String nome) {
        super(nome);
    }

    public void mover(int x, int y) {
        setCoordenadas(x,y);
        System.out.println("Movimento do anfibio");
    }


}
