package br.com.alura.Loja.desconto;

import java.math.BigDecimal;

import br.com.alura.Loja.Orcamento.Orcamento;

public class SemDesconto extends Desconto {
				
	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo (Orcamento orcamento) {
		return BigDecimal.ZERO;

    }

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return true;
	}
}


