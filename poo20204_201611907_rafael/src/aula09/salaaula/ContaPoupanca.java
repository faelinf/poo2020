package aula09.salaaula;

public class ContaPoupanca extends Conta {

        private double juros;

    @Override
    public boolean validarConta() {
        if (numero>100000)
            return false;
        else
            return true;
    }
}
