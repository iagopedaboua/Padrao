package upis.projeto;

import upis.projeto.interfaceBidimencional;
import upis.projeto.Retangulo;
import upis.projeto.Triangulo;
import upis.projeto.Circulo;
import upis.projeto.Quadrado;

public class principal {
	public static void main(String[] args) {
		
		exibir(new Triangulo(3,4,5));
		
		exibir(new Triangulo(2,2,2));
		
		exibir(new Retangulo(1, 3));
		
		exibir(new Quadrado(5,5,5,5));
		exibir(new Circulo(5));
		
	}
	
	private static void exibir(interfaceBidimencional f) {
		System.out.println("Area =  "+f.area());
		System.out.println("Perimetro = "+f.perimetro());
	}
}