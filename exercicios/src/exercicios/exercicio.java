package exercicios;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double hora;
		
		int resp = 1;
		while (resp != 0){
			
			System.out.println("Quantas horas são?");
			hora = sc.nextDouble();
			if (hora < 12) {
				
				System.out.println("Bom dia");
				
			}else if (hora >= 12 && hora < 18) {
				
				System.out.println("Boa tarde");
				
			}else {
				
				System.out.println("Boa noite");
				
			}
			
		System.out.println("Deseja continuar? (y/n)");
		resp = sc.nextInt();
		}		
		sc.close();
		System.out.println("End");
		
	}

}
