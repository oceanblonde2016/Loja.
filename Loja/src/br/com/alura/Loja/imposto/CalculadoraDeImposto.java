package br.com.alura.Loja.imposto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public class CalculadoraDeImposto  {
	
	
	public BigDecimal calcula(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcular(orcamento);
    }
}
	
		
		


