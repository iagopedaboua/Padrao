package upis.projeto;

import upis.projeto.interfaceBidimencional;

public class Triangulo implements interfaceBidimencional{

	private int ladoA;
	private int ladoB;
	private int ladoC;

	private boolean condicaoExistencia(int a, int b, int c) {
		
		return Math.abs(b - c) < a && a < b + c;
	}

	public Triangulo() {
		this.ladoA = 1;
		this.ladoB = 1;
		this.ladoC = 1;
	}

	public Triangulo(int a, int b, int c) {

		if (!condicaoExistencia(a, b, c)) {
			throw new RuntimeException("Impossível construir triângulo");
		}

		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}

	@Override
	public String toString() {
		return "(" + this.ladoA + ", " + this.ladoB + ", " + this.ladoC + ")";
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int a) {
		if (condicaoExistencia(a, ladoB, ladoC)) {
			this.ladoA = a;
		}
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

	public double perimetro() {
		return (int) ladoA + (int)ladoB + (int)ladoC;
	}
	
	public double area() {
		
		int s = (int )perimetro() / 2;
		
		int sa = s * (s - ladoA) * (s - ladoB) * (s - ladoC);
				
		return Math.sqrt(sa);
	}
}
