package AtividadeLista1.aula01;

import java.text.DecimalFormat;

public class CalculaMedia {
    public static void main(String[] args) {
    	
        String nomeAluno1 = "Paulo";
        double nota1Aluno1 = 8.0;
        double nota2Aluno1 = 6.0;
        double nota3Aluno1 = 5.0;

        String nomeAluno2 = "Maria";
        double nota1Aluno2 = 4.0;
        double nota2Aluno2 = 6.0;
        double nota3Aluno2 = 3.0;

        String nomeAluno3 = "Jos�";
        double nota1Aluno3 = 6.0;
        double nota2Aluno3 = 4.0;
        double nota3Aluno3 = 9.0;

        String nomeAluno4 = "Patr�cia";
        double nota1Aluno4 = 7.0;
        double nota2Aluno4 = 8.0;
        double nota3Aluno4 = 9.0;

        double mediaAluno1 = (nota1Aluno1 + nota2Aluno1 + nota3Aluno1)/3;
        double mediaAluno2 = (nota1Aluno2 + nota2Aluno2 + nota3Aluno2)/3;
        double mediaAluno3 = (nota1Aluno3 + nota2Aluno3 + nota3Aluno3)/3;
        double mediaAluno4 = (nota1Aluno4 + nota2Aluno4 + nota3Aluno4)/3;

        double mediaGeral =
                (mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4)/4;

        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.println("M�dia de " + nomeAluno1 + " = " + df.format(mediaAluno1));
        System.out.println("M�dia de " + nomeAluno2 + " = " + df.format(mediaAluno2));
        System.out.println("M�dia de " + nomeAluno3 + " = " + df.format(mediaAluno3));
        System.out.println("M�dia de " + nomeAluno4 + " = " + df.format(mediaAluno4));

        System.out.println("M�dia Geral = " + df.format(mediaGeral));
    }

}
