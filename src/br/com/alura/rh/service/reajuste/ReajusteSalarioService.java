package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteSalarioService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteSalarioService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public BigDecimal reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
       validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));
       return funcionario.getDadosPessoais().getSalario().add(aumento);
    }

}
