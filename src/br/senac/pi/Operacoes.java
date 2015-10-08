package br.senac.pi;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner(System.in);
		
		String nome;
		
		System.out.print("Digite o seu nome: ");
		
		nome = leitura.next();
		
		System.out.println("Você digitou: "+nome);
		
		leitura.close();		
		
	
		
	}

}
