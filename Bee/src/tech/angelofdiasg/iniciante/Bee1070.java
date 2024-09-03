package tech.angelofdiasg.iniciante;

import java.util.Scanner;

public class Bee1070 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valorX = leitor.nextInt();
		int cont = 0;
		while (cont < 6) {
			if(valorX % 2 == 1) {
				System.out.println(valorX);
				cont++;
			}
			valorX++;
		}
	}

}
