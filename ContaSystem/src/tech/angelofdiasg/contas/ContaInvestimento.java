package tech.angelofdiasg.contas;

public class ContaInvestimento extends Conta{
	double taxa;
	int prazo;
	
   boolean sacar(double quantidade) {
	   if (this.saldo < quantidade) {
		   return false;
	   } else {
		   this.saldo = this.saldo - (quantidade * 1.01);
		   return true; 
	   }
   }
   
   boolean depositar(double quantidade) {
	   if(quantidade == 0 || quantidade < 0) {
		   return false;
	   } else {
		   this.saldo = this.saldo + (quantidade * 1.01);
		   return true;
	   }
   }
   
   void aplicarRendimento(double taxa) {
	   this.saldo += this.saldo * taxa / 100;
   }

}
