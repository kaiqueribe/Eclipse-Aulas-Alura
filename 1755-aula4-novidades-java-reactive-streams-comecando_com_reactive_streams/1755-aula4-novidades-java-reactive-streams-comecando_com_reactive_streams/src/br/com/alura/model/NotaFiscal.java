package br.com.alura.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class NotaFiscal {

	private String nome;
	@SuppressWarnings("unused")
	private Double valor;
	private LocalDate data;
	private LocalTime time;

	public NotaFiscal(String nome, Double valor, LocalDate data, LocalTime time) {
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.time = time;
	}

	public String getNome() {
		return nome;
	}
	
	public Double getValor() {
		return valor;
	}

	public LocalDate getData() {
		return data;
	}
	
	public LocalTime getTime() {
		return time;
		
	}
}
