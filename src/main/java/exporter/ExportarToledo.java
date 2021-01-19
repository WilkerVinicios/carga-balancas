package exporter;

import model.Produto;
import model.TabelaNutricional;
import repository.ProdutoRepository;
import repository.TabelaNutricionalRepository;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportarToledo {
    private static ProdutoRepository repository;
    private static TabelaNutricionalRepository nutricionalRepository;

    public static void exportarItensMGV() {
        StringBuilder conteudo = new StringBuilder();
        ExportarToledo.buscar().forEach(produto -> {
            conteudo.append(produto.montarItensMGVBalancaToledo());
        });
        FileWriter arquivo;
        try {
            arquivo = new FileWriter("/home/wilker/Balancas/Toledo/ITENSMGV.TXT");
            arquivo.write(conteudo.toString());
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Arquivo ITENSMGV exportado com sucesso para /home/wilker/Balancas/Toledo/");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        repository.fecharConexao();
    }

    public static void exportarTxItem() {
        StringBuilder conteudo = new StringBuilder();
        ExportarToledo.buscar().forEach(produto -> {
            conteudo.append(produto.montarTxItemBalancaToledo());
        });
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File("/home/wilker/Balancas/Toledo/TXITENS.TXT"));
            arquivo.write(conteudo.toString());
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Arquivo TXITENS exportado com sucesso para /home/wilker/Balancas/Toledo/");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        repository.fecharConexao();
    }

//    public static void exportarTxInfo() {
//        StringBuilder conteudo = new StringBuilder();
//        ExportarToledo.buscar().forEach(produto -> {
//            conteudo.append(produto.montarTxInfoBalancaToledo());
//        });
//        FileWriter arquivo;
//        try {
//            arquivo = new FileWriter(new File("/home/wilker/Balancas/Toledo/TXINFO.TXT"));
//            arquivo.write(conteudo.toString());
//            arquivo.close();
//            JOptionPane.showMessageDialog(null, "Arquivo TXINFO exportado com sucesso para /home/wilker/Balancas/Toledo/");
//        } catch (IOException e) {
//            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
//            e.printStackTrace();
//        }
//        repository.fecharConexao();
//    }

    public static void exportarInfNutri() {
        StringBuilder conteudo = new StringBuilder();
        ExportarToledo.buscarNutri().forEach(nutricional -> {
            conteudo.append(nutricional.montarInfNutriBalancaToledo());
        });
        FileWriter arquivo;
        try {
            arquivo = new FileWriter(new File("/home/wilker/Balancas/Toledo/INFNUTRI.TXT"));
            arquivo.write(conteudo.toString());
            arquivo.close();
            JOptionPane.showMessageDialog(null, "Arquivo INFNUTRI exportado com sucesso para /home/wilker/Balancas/Toledo/");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gerar o arquivo!\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        nutricionalRepository.fecharConexao();
    }

    private static List<Produto> buscar() {
        repository = new ProdutoRepository();
        List<Produto> produtos = repository.produtosPesaveis();
        return produtos;
    }

    private static List<TabelaNutricional> buscarNutri() {
        nutricionalRepository = new TabelaNutricionalRepository();
        List<TabelaNutricional> nutricionais = nutricionalRepository.produtosNutricionais();
        return  nutricionais;
    }
}
