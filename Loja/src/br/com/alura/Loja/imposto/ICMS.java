package br.com.alura.Loja.imposto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public class ICMS implements Imposto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
		
	}

}
