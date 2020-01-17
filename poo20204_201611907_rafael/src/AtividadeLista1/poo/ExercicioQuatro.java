package AtividadeLista1.poo;
import java.util.Scanner;


public class ExercicioQuatro {
 
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
 
    String s;
    char c;
    int i, n;
 
    System.out.printf("Informe uma String:\n");
    s = ler.nextLine();
 
    System.out.println();
 
    n = s.length(); 
    for (i=0; i<n; i++) {
      c = s.charAt(i);
      if (Character.isDigit(c))
         System.out.printf("%c <--- número\n", c);
      else if (Character.isLowerCase(c))
              System.out.printf("%c <--- letra minúscula\n", c);
           else if (Character.isUpperCase(c))
                   System.out.printf("%c <--- letra maiúscula\n", c);
                else if (Character.isSpaceChar(c))
                        System.out.printf("%c <--- space blank\n", c);
                     else System.out.printf("%c\n", c);
    }
  }
 
}