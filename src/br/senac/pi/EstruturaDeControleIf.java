
package br.senac.pi;

public class EstruturaDeControleIf {
	
	public static void main(String[] args) {
int idade = 18;
	if(idade>= 18){
		System.out.println("Blz, pode entrar!");
	} else if (idade >= 17){
		System.out.println("Pode entrar somente com acompanhante!");
	}else{
		System.out.println("Não pode entrar!");
	}
	
	//outra construçao com if
		boolean var = true;
		if(var){
			System.out.println("isso vai ser execultado se for true.");
		} else {
			System.out.println("isso vai ser execultado se for false.");
		}
	}
}