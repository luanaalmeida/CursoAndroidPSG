package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		
		//c1 é uma istancia
		Carro c1 = new Carro();
		
		c1.marca = "Ferrari"; //atribuição de valores e atributos
		c1.modelo = "F448";
		c1.chassi = "F45679FRTY";
		c1.ano = 2015;
		
		System.out.print("Marca" + c1.marca);
		System.out.print("Modelo" + c1.modelo);
		System.out.print("Chassi" + c1.chassi);
		System.out.print("Ano" + c1.ano);
		
		c1.partida(); //chamada ao método
		c1.acelerar();
		c1.freiar();
	}
}