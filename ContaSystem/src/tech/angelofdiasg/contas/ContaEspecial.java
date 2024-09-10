package tech.angelofdiasg.contas;

public class ContaEspecial extends Conta {
	double limite;
	
   boolean sacar(double quantidade) {
	   if (this.saldo < quantidade) {
		   return false;
	   } else {
		   this.saldo = this.saldo - (quantidade * 0.99);
		   return true; 
	   }
   }
}
