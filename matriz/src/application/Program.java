package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Digite um campo: ");
		int x = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					if (i == 0) {

						if (j == 0) {
							System.out.println("Position: " + i + "," + j);
							System.out.println("Right: " + mat[i][j + 1]);
							System.out.println("Down: " + mat[i + 1][j]);
						} else if (j == mat[i].length-1) {
							System.out.println("Position: " + i + "," + j);
							System.out.println("Left: " + mat[i][j - 1]);
							System.out.println("Down: " + mat[i + 1][j]);
						} else {
							System.out.println("Position: " + i + "," + j);
							System.out.println("Left: " + mat[i][j - 1]);
							System.out.println("Right: " + mat[i][j + 1]);
							System.out.println("Down: " + mat[i + 1][j]);
						}

					} else if (i == mat.length-1) {

						if (j == 0) {
							System.out.println("Position: " + i + "," + j);
							System.out.println("Right: " + mat[i][j + 1]);
							System.out.println("up: " + mat[i - 1][j]);
						} else if (j == mat[i].length-1) {
							System.out.println("Position: " + i + "," + j);
							System.out.println("Left: " + mat[i][j - 1]);
							System.out.println("up: " + mat[i - 1][j]);
						} else {
							System.out.println("Position: " + i + "," + j);
							System.out.println("Left: " + mat[i][j - 1]);
							System.out.println("Right: " + mat[i][j + 1]);
							System.out.println("up: " + mat[i - 1][j]);
						}

					} else if (j == 0) {
						System.out.println("Position: " + i + "," + j);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);
					} else if (j == mat[i].length-1) {
						System.out.println("Position: " + i + "," + j);
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					} else {

						System.out.println("Position: " + i + "," + j);
						System.out.println("Left: " + mat[i][j - 1]);
						System.out.println("Right: " + mat[i][j + 1]);
						System.out.println("up: " + mat[i - 1][j]);
						System.out.println("Down: " + mat[i + 1][j]);

					}
				}
			}
		}

		sc.close();

	}

}
