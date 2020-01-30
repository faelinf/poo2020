package aula09.salaaula;


public class Exemplo implements IExemplo{

    @Override
    public void metoodo1() {
        System.out.println("Implementando metodo 1");
    }

    @Override
    public String metodo2() {
        return "Implementando metodo 2";
    }

    public static void main (String[] args){
        Exemplo ex = new Exemplo();
        ex.metoodo1();
        System.out.println(ex.metodo2());

    }
}
