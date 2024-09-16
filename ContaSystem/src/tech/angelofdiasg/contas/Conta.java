package tech.angelofdiasg.contas;

public class Conta {
	   private int numero;
	   private double saldo;

	   public boolean sacar(double quantidade) {
		   if (this.saldo < quantidade) {
			   return false;
		   } else {
			   this.saldo = this.saldo - quantidade;
			   return true; 
		   }
	   }
	   
	   public boolean depositar(double quantidade) {
		   if(quantidade == 0 || quantidade < 0) {
			   return false;
		   } else {
			   this.saldo = this.saldo + quantidade;
			   return true;
		   }
	   }
	   
	   
	   public Conta() {
		   System.out.println("Conta VAZIA criada.");
	   }
	   
	public Conta(int numero) {
		super();
		this.numero = numero;
	}

	public Conta(int numero, double saldo) {
		System.out.println("Objeto PREENCHIDO criado!");
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}   
	   
}
