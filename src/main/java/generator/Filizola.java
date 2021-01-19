package generator;

import model.Produto;
import org.apache.commons.lang3.StringUtils;

public class Filizola {
    private Produto produto;
    private static int indiceDepartamento = 1;

    public Produto getProduto() { return produto; }

    public void setProduto(Produto produto) { this.produto = produto; }

    private String completarComZeroDireita(int tamanho, String valor) {
        String retorno = StringUtils.leftPad(valor, tamanho, "0");
        return retorno;
    }

    private String completarComEspacoDireita(int tamanho, String valor) {
        String retorno = StringUtils.rightPad(valor, tamanho, " ");
        return retorno;
    }

    //CADTXT.TXT
    private String montarCodigo() {
        String novoCodigoEan;
        if (this.produto.getEan().length() > 6) {
            novoCodigoEan = this.produto.getEan().substring(0, 5);
            return completarComZeroDireita(6, novoCodigoEan);
        } else {
            return completarComZeroDireita(6, this.produto.getEan());
        }
    }

    private String montarTipoPreco() {
        String tipoPreco;
        if(this.produto.getUnidadeMedida().equalsIgnoreCase("un")) {
            tipoPreco = "U";
            return tipoPreco;
        } else {
            tipoPreco = "P";
            return tipoPreco ;
        }
    }

    private String montarDescricao() {
        String novaDescricao;
        if (this.produto.getDescricao().length() > 22) {
            novaDescricao = this.produto.getDescricao().substring(0, 21);
            return completarComEspacoDireita(22, novaDescricao);
        } else {
            return completarComEspacoDireita(22, this.produto.getDescricao());
        }
    }

    private String montarPreco() {
        String precoConvertido = this.produto.getPrecoVenda().toString().replace(".", "");
        String novoPreco;
        if (precoConvertido.length() > 7) {
            novoPreco = precoConvertido.substring(0, 6);
            return completarComZeroDireita(7, novoPreco);
        } else {
            return completarComZeroDireita(7, precoConvertido);
        }
    }

    private String montarValidade() {
        String validade;
        if(this.produto.getValidade().length() > 3) {
            validade = this.produto.getValidade().substring(0,2);
            return completarComZeroDireita(3,validade);
        }else{
            return completarComZeroDireita(3,this.produto.getValidade());
        }
    }

    //SETORTXT.TXT
    private String montarNomeSetor() {
        String novoDepartamento;
        if(this.produto.getDepartamento().length() > 12) {
            novoDepartamento = this.produto.getDepartamento().substring(0,11);
            return completarComEspacoDireita(12,novoDepartamento);
        } else {
            novoDepartamento = this.produto.getDepartamento();
            return completarComEspacoDireita(12,novoDepartamento);
        }
    }

    private String montarIndice() {
        String indiceConvetido = Integer.toString(indiceDepartamento);
        indiceDepartamento++;
        return completarComZeroDireita(4,indiceConvetido);
    }

    private String montarTecla() {
        return "000";
    }

    //montar linhas do .TXT
    public String montarCadTxt() {
        String linha = montarCodigo() + montarTipoPreco() + montarDescricao() + montarPreco() + montarValidade() + "\r\n";
        return linha;
    }

    public String montarSetorTxt() {
        String linha = montarNomeSetor() + montarCodigo() + montarIndice() + montarTecla() + "\r\n";
        return linha;
    }
}
