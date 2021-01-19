package model;

import generator.Filizola;

public class Produto {
    private String departamento;
    private String unidadeMedida;
    private String ean;
    private String precoVenda;
    private String validade;
    private String descricao;

    public Produto() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String montarCadBalancaFilizola() {
        Filizola item = new Filizola();
        item.setProduto(this);
        return item.montarCadTxt();
    }

    public String montarSetorBalancaFilizola() {
        Filizola item = new Filizola();
        item.setProduto(this);
        return item.montarSetorTxt();
    }

}

