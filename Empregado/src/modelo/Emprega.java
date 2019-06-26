package modelo;

public class Emprega {
	private String matr;
	private double salb1;
	private double salb2;

	public String getMatr() {
		return matr;
	}

	public void setMatr(String matr) {
		this.matr = matr;
	}

	public double getSalb1() {
		return salb1;
	}

	public void setSalb1(double salb1) {
		this.salb1 = salb1;
	}

	public double getSalb2() {
		return salb2;
	}

	public void setSalb2(double salb2) {
		this.salb2 = salb2;
	}
	
	public double desc(){
		return (salb1 * 0.5);
	}
	
	public double acre(){
		return (salb2 * 0.9);
		
	}
	
	public double novodesc(){
		return (salb1 - desc());
		
	}
	
	public double novoacre(){
		return (salb2 + acre());
	}

}
