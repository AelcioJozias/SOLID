package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeridiocidade implements ValidacaoReajuste {
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoAumento = funcionario.getDataUltimoReajuste();
        LocalDate dataAgora = LocalDate.now();
        long meses = ChronoUnit.MONTHS.between(dataUltimoAumento, dataAgora);
        if(meses < 6) {
            throw new ValidacaoException("Tempo mínimo de 6 entre cada reajuste salarial");
        }
    }
}
