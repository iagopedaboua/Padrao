package upis.projeto;
import upis.projeto.interfaceBidimencional;

public class Circulo implements interfaceBidimencional {
	private double raio;
	
	public boolean condicaoExistencia(double a) {
		return  a!=0  ; 
	}
	
	
public Circulo(int a) {
	if (!condicaoExistencia(a)) {
		throw	new RuntimeException("Impossivel Cosntruir quadrado");
	}
	this.raio=a;
	this.raio =3;
}
	

	
  public double getRaio() {
		return raio;
	}
	public double setRaio(double raio) {
		return raio=raio;
	}
	
	@Override
	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public double area() {
		int Raio= (int) raio^2;
		
		return Math.PI*Raio;
	}
	@Override
	public String toString() {
		return ("("+raio+")");
	}
}
