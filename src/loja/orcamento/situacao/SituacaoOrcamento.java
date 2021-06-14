package loja.orcamento.situacao;

import loja.DomainException;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

// Classe modelo/casca. Funciona como padrão pra cada uma das situações possíveis.
public abstract class SituacaoOrcamento {

    // Padrão de estado conforme a situação. De acordo com estado aplica-se uma nova regra de negócio.
    // É possível que um objeto se comporte de formas diferentes, dependendo de seu estado.
    // Nesse padrão podemos trabalhar a transição de estado. Ex: se estiver no A posso ir pro B e C...
    // Existe uma regra de transição de estados.
    // State Pattern, muito parecido com o strategy, pois elimina os if elses.

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizado");
    }
}