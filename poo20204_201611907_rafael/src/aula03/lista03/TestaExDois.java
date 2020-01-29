package aula03.lista03;
import java.util.Scanner;

public class TestaExDois {


        public static void main(String[] args) {

            Agenda ag = new Agenda();
            int qtdade_pessoas, index;
            String nome;

            System.out.println("Quer cadastrar quantas pessoas? \n total de cadastrados: ");
            Scanner in_teclado = new Scanner(System.in);
            qtdade_pessoas = in_teclado.nextInt();
            ag.quantidade_de_pessoa(qtdade_pessoas);

            for (int i = 0; i < qtdade_pessoas; i++) {
                Agenda.set_armazenaPessoa(i);
            }


            for (int i = 0; i < qtdade_pessoas; i++) {
                Agenda.get_imprimeAgenda(i);
            }


            System.out.println("Coloque aqui o nome da pessoa que vc procura");
            in_teclado = new Scanner(System.in);
            nome = in_teclado.nextLine();
            int position = Agenda.buscaPessoa(nome);
            if (position >= 0) {
                System.out.println("O " + nome + " se encontra na posisao: " + (position + 1));
            } else {
                System.out.println("o nome desejado nao esta nesta lista");
            }


            System.out.println("Coloque aqui o numero de ordem da pessoa na lista: ");
            in_teclado = new Scanner(System.in);
            index = in_teclado.nextInt();
            for (int i = 0; i < qtdade_pessoas; i++) {
                if (i == (index - 1)) {
                    Agenda.get_imprimeAgenda(i);
                }
            }


            System.out.println("Coloque aqui o numero de ordem da pessoa na lista que deseja remover: ");
            in_teclado = new Scanner(System.in);
            index = in_teclado.nextInt();
            for (int i = 0; i < qtdade_pessoas; i++) {
                if (i == (index - 1)) {
                    Agenda.removePessoa(i);
                }
            }


            for (int i = 0; i < qtdade_pessoas; i++) {
                Agenda.get_imprimeAgenda(i);
            }
        }
}
