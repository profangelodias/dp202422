package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import tech.angelofdiasg.composicao.Endereco;
import tech.angelofdiasg.composicao.Telefone;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private Telefone telsContato;

	private Scanner leitor = new Scanner(System.in);
	
	public void cadastrar() {
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
	
	

}
