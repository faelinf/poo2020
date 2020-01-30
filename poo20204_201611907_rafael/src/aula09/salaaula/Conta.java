package aula09.salaaula;

/**
 * Created by Alunoinf_2 on 29/01/2020.
 */
public abstract class Conta {
    protected double numero;
    protected double saldo;
    protected Cliente titular;

    public void sacar(double valor) {
        if (this.saldo<valor){
            this.saldo = saldo - valor ;
        }else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor){
        this.saldo = saldo - valor;
    }

    public void transferir(int valor, Conta destino){
        if (this.saldo >= valor){
            this.sacar(valor);
            destino.depositar(valor);
        }else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public abstract boolean validarConta();


}
