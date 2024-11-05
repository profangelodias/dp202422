package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

import tech.angelofdiasg.classesaux.Endereco;
import tech.angelofdiasg.classesaux.Telefone;
import tech.angelofdiasg.interfaces.Cadastramento;

public class Pessoa implements Cadastramento {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;

	private Scanner leitor = new Scanner(System.in);
	
	public void cadastrar() {
		try{
			System.out.println("Informe o nome: ");
			this.nome = leitor.nextLine();
			System.out.println("Informe a data de nascimento! ");
			System.out.println("Informe o dia: ");
			int dia = leitor.nextInt();
			System.out.println("Informe o mês: ");
			int mes = leitor.nextInt();
			System.out.println("Informe o ano: ");
			int ano = leitor.nextInt();
			this.dataNascimento = LocalDate.of(ano, mes, dia);
			this.endereco = new Endereco();
			this.endereco.cadastrar();
			this.telsContato = new Telefone();
			this.telsContato.cadastrar();
		} catch (InputMismatchException e){
			System.out.println("Valor informado está incorreto! Informe" +
					"um inteiro");
			this.cadastrar();
		} catch (Exception e){
			System.out.println("Erro inesperado:" + e.getMessage());
		}
	}
	
	public int obterIdade(){
		LocalDate dataNascimento = this.dataNascimento;
		LocalDate dataAtual = LocalDate.now();

		Period periodo = Period.between(dataNascimento, dataAtual);

		return periodo.getYears();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelsContato() {
		return telsContato;
	}

	public void setTelsContato(Telefone telsContato) {
		this.telsContato = telsContato;
	}
}
