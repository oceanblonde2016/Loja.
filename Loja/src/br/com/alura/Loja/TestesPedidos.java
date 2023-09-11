package br.com.alura.Loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.Loja.pedido.GeraPedido;
import br.com.alura.Loja.pedido.GeraPedidoHandler;
import br.com.alura.Loja.pedido.acao.EnviarEmail;
import br.com.alura.Loja.pedido.acao.SalvarPedidosNoBD;

public class TestesPedidos {
	public static void main(String[] args) {
		String Cliente = "Celino";
		BigDecimal valorOrcamento = new BigDecimal("500");
		int quantidadeDeIntens = Integer.parseInt("1");
		
		GeraPedido gerador = new GeraPedido(Cliente, valorOrcamento, quantidadeDeIntens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidosNoBD(),
						new EnviarEmail()
				));
		handler.execute(gerador);
		
	}
	

	

}
