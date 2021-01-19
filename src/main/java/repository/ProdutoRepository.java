package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public List<Produto> produtosPesaveis() {
        Produto produto = new Produto();
        produto.setDepartamento("geral");    //não existe no banco
        produto.setUnidadeMedida("un");     //unidadee
        produto.setEan("222222");         //ean
        produto.setPrecoVenda("14.99");      //precoVenda
        produto.setValidade("112");      //validade
        produto.setDescricao("Amendoin"); //descricao

        Produto produto2 = new Produto();
        produto2.setDepartamento("horti-frutti");
        produto2.setUnidadeMedida("kg");
        produto2.setEan("322");
        produto2.setPrecoVenda("2.99");
        produto2.setValidade("15");
        produto2.setDescricao("Tomate KG");

        Produto produto3 = new Produto();
        produto3.setDepartamento("açougue");
        produto3.setUnidadeMedida("kg");
        produto3.setEan("2312");
        produto3.setPrecoVenda("34.94");
        produto3.setValidade("5");
        produto3.setDescricao("Alcatra KG");

        Produto produto4 = new Produto();
        produto4.setDepartamento("açougue");
        produto4.setUnidadeMedida("kg");
        produto4.setEan("4");
        produto4.setPrecoVenda("25.99");
        produto4.setValidade("20");
        produto4.setDescricao("Contra Filé KG");

        Produto produto5 = new Produto();
        produto5.setDepartamento("padaria");
        produto5.setUnidadeMedida("un");
        produto5.setEan("17");
        produto5.setPrecoVenda("25.99");
        produto5.setValidade("11");
        produto5.setDescricao("Bolo de Leite Ninho");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        return produtos;
    }

    public void fecharConexao() { }
}
