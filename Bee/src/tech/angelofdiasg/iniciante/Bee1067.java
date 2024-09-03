package tech.angelofdiasg.iniciante;

import java.util.Iterator;
import java.util.Scanner;

public class Bee1067 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int valorX = leitor.nextInt();
//		for (int i = 1; i <= valorX; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		int i = 1;
		while (i <= valorX) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
