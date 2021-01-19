package model;

import generator.Toledo;

import java.math.BigDecimal;

public class TabelaNutricional {

    private int codNutri;
    private BigDecimal quantidadePorPorcao;
    private BigDecimal unidadePorcao;
    private BigDecimal parteInteiraMedidaCaseira;
    private BigDecimal parteDecimalMedidaCaseira;
    private BigDecimal medidaCaseiraUtilizada;
    private BigDecimal valorCalorico;
    private BigDecimal valorCarboidratos;
    private BigDecimal valorProteinas;
    private BigDecimal valorGorduraTotal;
    private BigDecimal valorGorduraSaturada;
    private BigDecimal valorGorduraTrans;
    private BigDecimal valorFibra;
    private BigDecimal valorSodio;

    public TabelaNutricional() {
    }

    public TabelaNutricional(int codNutri, BigDecimal quantidadePorPorcao, BigDecimal unidadePorcao, BigDecimal parteInteiraMedidaCaseira, BigDecimal parteDecimalMedidaCaseira, BigDecimal medidaCaseiraUtilizada, BigDecimal valorCalorico, BigDecimal valorCarboidratos, BigDecimal valorProteinas, BigDecimal valorGorduraTotal, BigDecimal valorGorduraSaturada, BigDecimal valorGorduraTrans, BigDecimal valorFibra, BigDecimal valorSodio) {
        this.codNutri = codNutri;
        this.quantidadePorPorcao = quantidadePorPorcao;
        this.unidadePorcao = unidadePorcao;
        this.parteInteiraMedidaCaseira = parteInteiraMedidaCaseira;
        this.parteDecimalMedidaCaseira = parteDecimalMedidaCaseira;
        this.medidaCaseiraUtilizada = medidaCaseiraUtilizada;
        this.valorCalorico = valorCalorico;
        this.valorCarboidratos = valorCarboidratos;
        this.valorProteinas = valorProteinas;
        this.valorGorduraTotal = valorGorduraTotal;
        this.valorGorduraSaturada = valorGorduraSaturada;
        this.valorGorduraTrans = valorGorduraTrans;
        this.valorFibra = valorFibra;
        this.valorSodio = valorSodio;
    }

    public int getCodNutri() {
        return codNutri;
    }

    public void setCodNutri(int codNutri) {
        this.codNutri = codNutri;
    }

    public BigDecimal getQuantidadePorPorcao() {
        return quantidadePorPorcao;
    }

    public void setQuantidadePorPorcao(BigDecimal quantidadePorPorcao) {
        this.quantidadePorPorcao = quantidadePorPorcao;
    }

    public BigDecimal getUnidadePorcao() {
        return unidadePorcao;
    }

    public void setUnidadePorcao(BigDecimal unidadePorcao) {
        this.unidadePorcao = unidadePorcao;
    }

    public BigDecimal getParteInteiraMedidaCaseira() {
        return parteInteiraMedidaCaseira;
    }

    public void setParteInteiraMedidaCaseira(BigDecimal parteInteiraMedidaCaseira) {
        this.parteInteiraMedidaCaseira = parteInteiraMedidaCaseira;
    }

    public BigDecimal getParteDecimalMedidaCaseira() {
        return parteDecimalMedidaCaseira;
    }

    public void setParteDecimalMedidaCaseira(BigDecimal parteDecimalMedidaCaseira) {
        this.parteDecimalMedidaCaseira = parteDecimalMedidaCaseira;
    }

    public BigDecimal getMedidaCaseiraUtilizada() {
        return medidaCaseiraUtilizada;
    }

    public void setMedidaCaseiraUtilizada(BigDecimal medidaCaseiraUtilizada) {
        this.medidaCaseiraUtilizada = medidaCaseiraUtilizada;
    }

    public BigDecimal getValorCalorico() {
        return valorCalorico;
    }

    public void setValorCalorico(BigDecimal valorCalorico) {
        this.valorCalorico = valorCalorico;
    }

    public BigDecimal getValorCarboidratos() {
        return valorCarboidratos;
    }

    public void setValorCarboidratos(BigDecimal valorCarboidratos) {
        this.valorCarboidratos = valorCarboidratos;
    }

    public BigDecimal getValorProteinas() {
        return valorProteinas;
    }

    public void setValorProteinas(BigDecimal valorProteinas) {
        this.valorProteinas = valorProteinas;
    }

    public BigDecimal getValorGorduraTotal() {
        return valorGorduraTotal;
    }

    public void setValorGorduraTotal(BigDecimal valorGorduraTotal) {
        this.valorGorduraTotal = valorGorduraTotal;
    }

    public BigDecimal getValorGorduraSaturada() {
        return valorGorduraSaturada;
    }

    public void setValorGorduraSaturada(BigDecimal valorGorduraSaturada) {
        this.valorGorduraSaturada = valorGorduraSaturada;
    }

    public BigDecimal getValorGorduraTrans() {
        return valorGorduraTrans;
    }

    public void setValorGorduraTrans(BigDecimal valorGorduraTrans) {
        this.valorGorduraTrans = valorGorduraTrans;
    }

    public BigDecimal getValorFibra() {
        return valorFibra;
    }

    public void setValorFibra(BigDecimal valorFibra) {
        this.valorFibra = valorFibra;
    }

    public BigDecimal getValorSodio() {
        return valorSodio;
    }

    public void setValorSodio(BigDecimal valorSodio) {
        this.valorSodio = valorSodio;
    }

    public String montarInfNutriBalancaToledo() {
        Toledo item = new Toledo();
        item.setNutricional(this);
        return item.montarInfNutri();
    }
}
