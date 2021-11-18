package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rooms[] rent = new Rooms[10];
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			rent[room] = new Rooms(name, email, room);
		}
		System.out.println("Quartos alugados: ");
		for (int i = 0; i < 10; i++) {
			if (rent[i] != null) {
				System.out.println(rent[i]);
			} else {
				
			}
		}
		sc.close();
	}

}
