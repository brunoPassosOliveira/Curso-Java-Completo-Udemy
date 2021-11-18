package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.print("Nome:");
		aluno.nome = sc.nextLine();
		System.out.println("Nota primeiro trismestre: ");
		aluno.pTrimestre = sc.nextDouble();
		System.out.println("Nota segundo trismestre: ");
		aluno.sTrimestre = sc.nextDouble();
		System.out.println("Nota terceiro trismestre: ");
		aluno.tTrimestre = sc.nextDouble();

		System.out.println();
		System.out.println("Final Grade = " +aluno.notaFinal());
		if(aluno.notaFinal() < 60) {
			System.out.println("Failed");
			System.out.println("Missing " +aluno.result());
			
		}else {
			System.out.println();
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
