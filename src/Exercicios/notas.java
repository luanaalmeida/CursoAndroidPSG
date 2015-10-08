package Exercicios;
//import java.util.Scanner;


public class notas {
	public static void main(String[] args) {
		//Scanner entradaDados = new Scanner(System.in);
		
		double n1 = 0; 
		double n2 = 0;
		double n3 = 0;
		double media;
		
		System.out.println("digite a primeira nota" + n1);
		
		System.out.println("digite a segunda nota" + n2);
		
		System.out.println("digite a terceira nota" + n3);
		
		media =(n1 + n2 + n3)/3;
		
		if(media < 7){
			System.out.println("Aluno Reprovado");
		}else if(media >= 6){
			System.out.println("Aluno em Recuperação");	
		} else{
			System.out.println("Aluno Aprovado");
			}
	}
}
