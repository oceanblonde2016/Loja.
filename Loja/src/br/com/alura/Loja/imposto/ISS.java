package br.com.alura.Loja.imposto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public class ISS implements Imposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
		
	}

}
