package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> prodList = new ArrayList<>();

		System.out.print("Enter the number of Product: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Product #" + i + " data: ");

			System.out.print("Common, used or imported (c/u/i):  ");
			char typeP = sc.next().charAt(0);
			System.out.println();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (typeP == 'i') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				prodList.add(new ImportedProduct(name, price, customsFee));

			} else if (typeP == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				prodList.add(new UsedProduct(name, price, manufactureDate));

			} else {
				prodList.add(new Product(name, price));
			}
		}
		System.out.println();
		System.out.println("Price tags: ");
		sc.nextLine();
		for (Product prod : prodList) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}
}
