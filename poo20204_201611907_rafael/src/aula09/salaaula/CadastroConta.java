package aula09.salaaula;


public class CadastroConta {
    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente();
        ContaPoupanca c2 = new ContaPoupanca();

        c1.depositar(1000);
        c2.sacar(1000);

        c2.transferir(5000, c1);
    }
}
