package entities;

public class Conta {
	
	private int numConta;
	private String name;
	private double saldoConta;
	private int taxaSaque = 5;
	
	public Conta(int numConta, String name, double depInicial) {
		this.numConta = numConta;
		this.name = name;
		saldoConta = depInicial;
	}
	public Conta() {
		
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public void deposito(double deposito) {
		saldoConta += deposito;
	}
	public void saque(double saque) {
		saldoConta -= saque + taxaSaque;
	}
	public String toString() {
		return "Conta: " +numConta +", Titular: " +name +", Saldo: $ " +String.format("%.2f", getSaldoConta());
		
				
	}

}
