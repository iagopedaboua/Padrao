package upis.projeto;

import upis.projeto.interfaceBidimencional;

public class Retangulo implements interfaceBidimencional {

	private int comprimento;
	private int largura;
	
	private boolean condicaoExistencia(int c, int l) {
		return c > 0 && l > 0;
	}
	
	public Retangulo() {
		this.comprimento = 1;
		this.largura = 2;
	}

	public Retangulo(int comprimento, int largura) {
		
		if (!condicaoExistencia(comprimento, largura)) {
			throw new RuntimeException("Impossível construir retângulo.");
		}
		
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		if(condicaoExistencia(comprimento, largura)) {
			this.comprimento = comprimento;
		}
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		if(condicaoExistencia(comprimento, largura)) {
			this.largura = largura;
		}
	}

	public double perimetro() {
		return comprimento + comprimento + largura + largura;
	}

	public double area() {
		return comprimento * largura;
	}

	@Override
	public String toString() {
		return "(" + this.comprimento + ", " + this.comprimento + ", " + this.largura + ", " + this.largura + ")";
	}

}