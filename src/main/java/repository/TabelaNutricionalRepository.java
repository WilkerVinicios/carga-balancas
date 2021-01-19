package repository;

import model.TabelaNutricional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TabelaNutricionalRepository {
    public List<TabelaNutricional> produtosNutricionais() {
        TabelaNutricional nutricional = new TabelaNutricional();
        nutricional.setCodNutri(322);
        nutricional.setQuantidadePorPorcao(new BigDecimal("50.0000"));
        nutricional.setUnidadePorcao(new BigDecimal("0"));
        nutricional.setParteInteiraMedidaCaseira(new BigDecimal("00"));
        nutricional.setParteDecimalMedidaCaseira(new BigDecimal("0"));
        nutricional.setMedidaCaseiraUtilizada(new BigDecimal("00"));
        nutricional.setValorCalorico(new BigDecimal("11.0000"));
        nutricional.setValorCarboidratos(new BigDecimal("1.0000"));
        nutricional.setValorProteinas(new BigDecimal("2.0000"));
        nutricional.setValorGorduraTotal(new BigDecimal("3.0000"));
        nutricional.setValorGorduraSaturada(new BigDecimal("4.0000"));
        nutricional.setValorGorduraTrans(new BigDecimal("5.0000"));
        nutricional.setValorFibra(new BigDecimal("7.0000"));
        nutricional.setValorSodio(new BigDecimal("13.0000"));

        TabelaNutricional nutricional2 = new TabelaNutricional();
        nutricional2.setCodNutri(32);
        nutricional2.setQuantidadePorPorcao(new BigDecimal("100.0000"));
        nutricional2.setUnidadePorcao(new BigDecimal("0"));
        nutricional2.setParteInteiraMedidaCaseira(new BigDecimal("00"));
        nutricional2.setParteDecimalMedidaCaseira(new BigDecimal("0"));
        nutricional2.setMedidaCaseiraUtilizada(new BigDecimal("00"));
        nutricional2.setValorCalorico(new BigDecimal("130.0000"));
        nutricional2.setValorCarboidratos(new BigDecimal("10.0000"));
        nutricional2.setValorProteinas(new BigDecimal("20.0000"));
        nutricional2.setValorGorduraTotal(new BigDecimal("30.0000"));
        nutricional2.setValorGorduraSaturada(new BigDecimal("40.0000"));
        nutricional2.setValorGorduraTrans(new BigDecimal("50.0000"));
        nutricional2.setValorFibra(new BigDecimal("70.0000"));
        nutricional2.setValorSodio(new BigDecimal("122.0000"));

        TabelaNutricional nutricional3 = new TabelaNutricional();
        nutricional3.setCodNutri(2);
        nutricional3.setQuantidadePorPorcao(new BigDecimal("144.0000"));
        nutricional3.setUnidadePorcao(new BigDecimal("0"));
        nutricional3.setParteInteiraMedidaCaseira(new BigDecimal("00"));
        nutricional3.setParteDecimalMedidaCaseira(new BigDecimal("0"));
        nutricional3.setMedidaCaseiraUtilizada(new BigDecimal("00"));
        nutricional3.setValorCalorico(new BigDecimal("12.0000"));
        nutricional3.setValorCarboidratos(new BigDecimal("13.0000"));
        nutricional3.setValorProteinas(new BigDecimal("14.0000"));
        nutricional3.setValorGorduraTotal(new BigDecimal("15.0000"));
        nutricional3.setValorGorduraSaturada(new BigDecimal("16.0000"));
        nutricional3.setValorGorduraTrans(new BigDecimal("17.0000"));
        nutricional3.setValorFibra(new BigDecimal("18.0000"));
        nutricional3.setValorSodio(new BigDecimal("19.0000"));

        TabelaNutricional nutricional4 = new TabelaNutricional();
        nutricional4.setCodNutri(54452);
        nutricional4.setQuantidadePorPorcao(new BigDecimal("99.0000"));
        nutricional4.setUnidadePorcao(new BigDecimal("0"));
        nutricional4.setParteInteiraMedidaCaseira(new BigDecimal("00"));
        nutricional4.setParteDecimalMedidaCaseira(new BigDecimal("0"));
        nutricional4.setMedidaCaseiraUtilizada(new BigDecimal("00"));
        nutricional4.setValorCalorico(new BigDecimal("22.0000"));
        nutricional4.setValorCarboidratos(new BigDecimal("23.0000"));
        nutricional4.setValorProteinas(new BigDecimal("24.0000"));
        nutricional4.setValorGorduraTotal(new BigDecimal("25.0000"));
        nutricional4.setValorGorduraSaturada(new BigDecimal("26.0000"));
        nutricional4.setValorGorduraTrans(new BigDecimal("27.0000"));
        nutricional4.setValorFibra(new BigDecimal("28.0000"));
        nutricional4.setValorSodio(new BigDecimal("29.0000"));

        List<TabelaNutricional> nutricionais = new ArrayList<>();
        nutricionais.add(nutricional);
        nutricionais.add(nutricional2);
        nutricionais.add(nutricional3);
        nutricionais.add(nutricional4);
        return nutricionais;
    }

    public void fecharConexao() {
    }
}
