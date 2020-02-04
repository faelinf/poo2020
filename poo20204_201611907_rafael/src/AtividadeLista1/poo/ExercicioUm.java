package AtividadeLista1.poo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String nome = "";
        String matricula = "";
        int quantidade = 0;
        System.out.println("Quantidade de Alunos :");
        quantidade = sc.nextInt();
        ArrayList<String> myList = new ArrayList<String>();


        for (int i = 0; i < quantidade; i++) {
            if (i != 0) {
                System.out.println("Digite o nome do aluno:");
                System.out.println("Digite a matricula do aluno:");
                nome = sc.nextLine();
                matricula = sc.nextLine();
                myList.add("Aluno : " + nome + " matricula : " + matricula + "\n");
            }
        }

        System.out.println(myList);

    }

}