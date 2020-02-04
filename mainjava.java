package teste.java;

import java.util.Scanner;

public class mainjava {

	    public static void main (String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    System.out.println ("Digite o nome do aluno:");
	    String nome = sc.next();
	    System.out.println ("Informe a idade do aluno:");
	    int idade = sc.nextInt();
	    sc.close();
	    
	    System.out.println ("Aluno "+ nome +", sua idade é "+ idade + "anos.");
	 }
}
