package br.com.alura.Loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.Loja.Orcamento.Orcamento;
import br.com.alura.Loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.Loja.pedido.acao.EnviarEmail;
import br.com.alura.Loja.pedido.acao.SalvarPedidosNoBD;

public class GeraPedidoHandler {
	
	
		
		private List<AcaoAposGerarPedido> acoes;
		
		
		
		public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		
			this.acoes = acoes;
		}



		public void execute(GeraPedido dados) {
			Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
		
		
			Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
			
			
			acoes.forEach(a -> a.executarAcao(pedido));
		
		
		
	}
		
	}
	


