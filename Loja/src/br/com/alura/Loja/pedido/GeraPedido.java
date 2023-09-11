package br.com.alura.Loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.Loja.Orcamento.Orcamento;

public class GeraPedido {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeDeItens;
	public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeDeItens) {
		
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	

	public String getCliente() {
		return cliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
}
	
	


