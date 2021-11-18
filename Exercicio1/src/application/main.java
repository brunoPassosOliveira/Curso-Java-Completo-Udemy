package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		System.out.println("Digite o nome do titular da conta: ");
		String nome = sc.next();
		System.out.print("Deseja fazer um deposito Inicial? (y/n)");
		String resp = sc.next();
		Double depInicial;
		if (resp == "y") {
			System.out.println("Qual é o deposito inicial? ");
			depInicial = sc.nextDouble();

		}else {
			depInicial = 0.00;
		}
		Conta conta = new Conta(numConta, nome, depInicial);		
		System.out.println("Dados da conta: " +conta); 
		
		System.out.println("Quanto deseja depositar? ");
		double deposito = sc.nextDouble();
		
		conta.deposito(deposito);
		
		System.out.println("Dados da conta: " +conta); 
		
		System.out.println("Quanto deseja Sacar? ");
		double saque = sc.nextDouble();
		
		conta.saque(saque);
		
		System.out.println("Dados da conta: " +conta); 
		
		
		sc.close();
	
	}
	

}
