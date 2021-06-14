package loja.pedido;

import loja.orcamento.Orcamento;
import loja.pedido.acoes.AcaoAposGerarPedido;
import loja.pedido.acoes.EnviarEmailPedido;
import loja.pedido.acoes.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    // Padrão de projeto Command separa dados da execução desses mesmos dados. Como se fosse o Controller
    // e o Service.

    // construtor com injeção de dependências: repository, service, etc.

    public void execute(GeraPedido dados) {

        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

//        EnviarEmailPedido email = new EnviarEmailPedido();
//        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
//
//        email.executar(pedido);
//        salvar.executar(pedido);
    }
}
