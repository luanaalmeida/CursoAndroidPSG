package br.senac.pi.poo;

public class Carro {
	
	//atributos comuns a todos os carros
	String marca;
    String modelo;
    int ano;
    String placa;
    String chassi;
    
   //comportamento da classe (objeto) carro
    public void partida() {
    	System.out.println("Carro ligado");
    }
    	
    public void acelerar() {
    	System.out.println("Carro acelerado");
    }
    
    public void freiar() {
    	System.out.println("Carro parado");
    }
    
}
