package br.edu.senai.enums;

public enum PeriodoCurso {

	TARDE("Terça e Quinta", 40, 2500.), NOTURNO("Segunda e Quarta", 20, 1000.), INTEGRAL("Sexta", 80, 3200.);

	// Um construtor no enum ele é privado
	// Server para organizar a ordem de inserção dos campos

	private String diasDaSemana;
	private Integer cagarHoraria;
	private Double valor;

	private PeriodoCurso(String diasDaSemana, Integer cagarHoraria, Double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cagarHoraria = cagarHoraria;
		this.valor = valor;
	}

	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public Integer getCagarHoraria() {
		return cagarHoraria;
	}

	public Double getValor() {
		return valor;
	}

}
