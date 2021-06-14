package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }


    // pattern Template Method com a criação de um método concreto na classe “mãe”,
    // que chama métodos abstratos implementados nas classes “filhas”
    // Favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
    public  BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
    }
        return proximo.calcular(orcamento);

}
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}

