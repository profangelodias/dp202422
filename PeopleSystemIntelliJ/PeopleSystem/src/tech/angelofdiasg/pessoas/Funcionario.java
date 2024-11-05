package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.classesaux.Cargo;
import tech.angelofdiasg.interfaces.Cadastramento;

import java.time.LocalDate;

public class Funcionario extends Pessoa implements Cadastramento {
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
