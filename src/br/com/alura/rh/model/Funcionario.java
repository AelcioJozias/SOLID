package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(LocalDate dataUltimoReajuste, DadosPessoais dadosPessoais) {
		this.dataUltimoReajuste = dataUltimoReajuste;
		this.dadosPessoais = dadosPessoais;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.dadosPessoais.setNome(nome);
		this.dadosPessoais.setCpf(cpf);
		this.dadosPessoais.setCargo(cargo);
		this.dadosPessoais.setSalario(salario);
	}

	public void updateSalario(BigDecimal salario) {
		this.dadosPessoais.setSalario(salario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo cargo) {
		this.getDadosPessoais().setCargo(cargo);
	}

}
