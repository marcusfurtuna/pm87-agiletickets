package br.com.caelum.agiletickets.models;

import br.com.caelum.agiletickets.domain.precos.CalculadorDePreco;

public enum TipoDeEspetaculo {
	
	CINEMA(new CalculadorDePrecoCinema()), 
	SHOW(new CalculadorDePrecoShow()), 
	TEATRO(new CalculadorDePrecoTeatro()),
	BALLET(new CalculadorDePrecoBallet()),
	ORQUESTRA(new CalculadorDePrecoOrquestra());
	
	private final CalculadorDePreco calculadorDePreco;
	
	private TipoDeEspetaculo(CalculadorDePreco calculadorDePreco) {
		this.calculadorDePreco = calculadorDePreco;
	}
	
	public CalculadorDePreco getCalculadorDePreco() {
		return this.calculadorDePreco;
	}
	
}