package aula09.salaaula;


public abstract class ClasseAbstrata {
    public abstract void metodoAbstrato();
    public void metodoConcreto(){
        System.out.println("Inplementação do Metodo Concreto. " + this.getClass().getSimpleName());
    }
}
