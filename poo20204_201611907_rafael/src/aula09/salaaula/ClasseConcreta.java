package aula09.salaaula;


public class ClasseConcreta extends ClasseAbstrata {

    @Override
    public void metodoAbstrato() {
        System.out.println("Inplementação do metodo abstrato na classe: "
                + this.getClass().getSimpleName());
    }

    public static void main(String[] args){
        ClasseAbstrata cc = new ClasseConcreta();
        cc.metodoAbstrato();
        cc.metodoConcreto();
    }
}
