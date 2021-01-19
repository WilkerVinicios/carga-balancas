package exporter;

import model.Produto;
import repository.ProdutoRepository;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportarFilizola {
    private static ProdutoRepository repository;

    public static void exportarCad() {
        StringBuilder conteudo = new StringBuilder();
        ExportarFilizola.buscar().forEach(produto -> {
            conteudo.append(produto.montarCadBalancaFilizola());
        });
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File("/home/wilker/Balancas/Filizola/CADTXT.TXT"));
            arquivo.write(conteudo.toString());
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Arquivo CADTXT exportado com sucesso para /home/wilker/Balancas/Filizola/");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        repository.fecharConexao();
    }

    public static void exportarSetor() {
        StringBuilder conteudo = new StringBuilder();
        ExportarFilizola.buscar().forEach(produto -> {
            conteudo.append(produto.montarSetorBalancaFilizola());
        });
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File("/home/wilker/Balancas/Filizola/SETORTXT.TXT"));
            arquivo.write(conteudo.toString());
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Arquivo SETORTXT exportado com sucesso para /home/wilker/Balancas/Filizola/");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        repository.fecharConexao();
    }

    private static List<Produto> buscar() {
        repository = new ProdutoRepository();
        List<Produto> produtos = repository.produtosPesaveis();
        return produtos;
    }
}
