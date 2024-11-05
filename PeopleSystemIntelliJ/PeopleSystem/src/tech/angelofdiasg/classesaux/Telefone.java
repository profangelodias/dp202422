package tech.angelofdiasg.classesaux;

import java.util.Scanner;

public class Telefone {
	private int ddd;
	private String numero;
	private Scanner leitor = new Scanner(System.in);

	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void cadastrar(){
		System.out.println("Informe o DDD: ");
		this.ddd = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Informe o numero: ");
		this.numero = leitor.nextLine();
	}
	

}
