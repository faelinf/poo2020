package AtividadeLista1.poo;

import java.util.*;

public class ExercicioTres {

    public static void main(String[] args) {
        
    	Scanner scan1 = new Scanner(System.in);
        System.out.print("Qual a quantidade de números a ser buscado:");
        
        int a = scan1.nextInt();

        int i, j, k = 0;
        
        ArrayList<Integer> listBusca = new ArrayList<Integer>();
        int num[] = new int[a];
        int numeroDado[] = new int[a];
        int numeroBuscado = 0;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite algum numero: ");

        for (i = 0; i < a; i++)
            num[i] = scan2.nextInt();

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (num[i] > num[j])
                    k++;
            }
            numeroDado[i] = k++;
            k = 0;
        }

        System.out.print("Crescente: ");
        for (i = 0; i < a; i++)
            listBusca.add(num[i]);
            for (j = 0; j < a; j++)
                if (numeroDado[j] == i)
                    System.out.print(num[j] + ",");
        System.out.print("\n");

        System.out.print("Decrescente: ");
        for (i = 0; i <= a; i++)
            for (j = 0; j < a; j++)
                if (numeroDado[j] == a - i)
                    System.out.print(num[j] + ",");
        System.out.print("\n");

        System.out.println("Qual o numero a ser buscado: ");
        numeroBuscado = scan1.nextInt();

        for (i = 0; i <= a; i++) {
            
        	for (j = 0; j < a; j++) {
                
        		for (int element : listBusca) {
                    
        			if (element == listBusca.get(i)) {
                        
        				System.out.print("AI SIM");
                        
        				break;
                    }
                }
            }
            }
        }
    }



