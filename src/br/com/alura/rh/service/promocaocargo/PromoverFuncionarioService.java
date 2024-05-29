package br.com.alura.rh.service.promocaocargo;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromoverFuncionarioService {
    public void promover(Funcionario funcionario, boolean metaBatida) {
        if(Cargo.GERENTE.equals(funcionario.getDadosPessoais().getCargo())) {
            throw new ValidacaoException("O funcionário não pode ser promovido, pois já está no maior cargo");
        }
        if(metaBatida) {
            funcionario.promover(funcionario.getDadosPessoais().getCargo().proximoCargo());
        }
    }
}
