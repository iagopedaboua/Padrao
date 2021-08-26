package upis.projeto;
import upis.projeto.interfaceBidimencional;

public class Quadrado implements interfaceBidimencional {

	private int lA;
	private int lB;
	private int lC;
	private int lD;
	

	private boolean condicaoExistencia(int a,int b, int c, int d) {
		return  a==b && b==c && d==c ;	
	}
		public Quadrado() {
			this.lA= 3;
			this.lB= 3;
			this.lC= 3;
			this.lD= 3;
			
		}
		public Quadrado (int a,int b, int c , int d) {
			if (!condicaoExistencia(a, b, c, d)) {
				throw new RuntimeException("Impossível construir Quadrado.");
				
			}
			this.lA = a;
			this.lB = b;
			this.lC= c;
			this.lD=d;
	}
		
		public int getlA() {
			return lA;
		}
		public void setlA(int lA) {
			if (condicaoExistencia(lA, lB, lC, lD)) {
			this.lA = lA;
			}
		}
		
		public int getlB() {
			return lB;
		}
		public void setlB(int lB) {
			if (condicaoExistencia(lA, lB, lC, lD)) {
			this.lB = lB;
			}
		}
		public int getlC() {
			return lC;
		}
		public void setlC(int lC) {
			if (condicaoExistencia(lA, lB, lC, lD)) {
			this.lC = lC;
			}
		}
		public int getlD() {
			return lD;
		}
		public void setlD(int lD) {
			if (condicaoExistencia(lA, lB, lC, lD)) {
			this.lD = lD;
			}
		}
		
		 
		public double perimetro() {
			 return lA+lB+lC+lD;
		}
		 
		public double area() {
			 lA = lB;
			 lC = lB;
			 lD= lC;
			  int L = lD; 
			 
			 return L^2 ;		}
	@Override
	public String toString() {
		return "(" + this.lA + ", " + this.lB + ","+ this.lC+","+this.lD+")";
	}

	
	
}
