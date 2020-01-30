package aula04.as4b.exercicio01.alunos;

import java.util.ArrayList;
import java.util.List;

public class ClasseMatricula {

	public static void main(String[] args) {
		
		List<ClasseAluno> alunos = new ArrayList<ClasseAluno>();

		Curso d1 = new Departamento("Instituto de informatica","INF");
		Curso c1 = new Curso("Engenharia de Software","ES",(Departamento) d1);
		ClasseAluno a1 = new ClasseAluno("Rafael",201611545,2020,c1);
		
		Curso d2 = new Departamento("Instituto de informatica","INF");
		Curso c2 = new Curso("Ciencia da Computacao","CC",(Departamento) d2);
		ClasseAluno a2 = new ClasseAluno("Márcia",201873135,2020,c2);
		
		Curso d3 = new Departamento("Instituto de Matematica e Estatistica","IME");
		Curso c3 = new Curso("Matem�tica","MA",(Departamento) d3);
		ClasseAluno a3 = new ClasseAluno("Juao",201509332,2020,c3);
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		System.out.println(alunos.toString());
	}

}
