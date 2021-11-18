package entities;

public class Student {
	public String nome;
	public double pTrimestre;
	public double sTrimestre;
	public double tTrimestre;
	
	public double notaFinal() {
		return this.pTrimestre + this.sTrimestre + this.tTrimestre;
			
	}
	public double result() {
		if(notaFinal() < 60) {
			return 60.0 - notaFinal();
		}else {
			return 0.0;
		}
	}
	

}
	
