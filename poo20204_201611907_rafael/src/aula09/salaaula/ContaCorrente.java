package aula09.salaaula;

public class ContaCorrente extends Conta {

    private double limite;

    @Override
    public boolean validarConta() {
        if(numero <= 100000) {
            return false;
        }else{
            return true;
        }

    }
}
