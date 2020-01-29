package aula03.lista03;
import aula03.salaaula.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class TestaClasseElevador {
    public static void main(String[] args) {

        ClasseElevador elevador  = new ClasseElevador();
        int quantidadeAndar  = 10;
        int qualAndar = 5;
        ClasseEdificio edificio = new ClasseEdificio (quantidadeAndar,elevador);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        elevador.setAndar(edificio,qualAndar);
        System.out.println(elevador.getAndarAtual());
        System.out.println(elevador.getAndar());
        System.out.println(elevador.getPessoas());
    }
}


