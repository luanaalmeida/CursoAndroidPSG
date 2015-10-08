package br.senac.pi;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String teste;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite algo: ");
		
		teste = entrada.next();
		
		System.out.println("Você digitou: "+teste);
		
		entrada.close();
		
	}

}
