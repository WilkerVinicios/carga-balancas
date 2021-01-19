package generator;

import model.Produto;
import model.TabelaNutricional;
import org.apache.commons.lang3.StringUtils;

public class Toledo {
    private Produto produto;
    private TabelaNutricional nutricional;

    public Produto getProduto() { return produto; }

    public void setProduto(Produto produto) { this.produto = produto; }

    public TabelaNutricional getNutricional() { return nutricional; }

    public void setNutricional(TabelaNutricional nutricional) { this.nutricional = nutricional; }

    //TXITENS.TXT e ITENSMGV.TXT
    private String completarComZeroDireita(int tamanho, String valor) {
        String retorno = StringUtils.leftPad(valor, tamanho, "0");
        return retorno;
    }

    private String completarComEspacoDireita(int tamanho, String valor) {
        String retorno = StringUtils.rightPad(valor, tamanho, " ");
        return retorno;
    }

    private String montarDepartamento() {
        String departamento;
        if(this.produto.getDepartamento().equalsIgnoreCase("rações")) {
            departamento = "05";
            return completarComZeroDireita(2,departamento);
        } else if(this.produto.getDepartamento().equalsIgnoreCase("horti-frutti")) {
            departamento = "04";
            return  completarComZeroDireita(2,departamento);
        } else if(this.produto.getDepartamento().equalsIgnoreCase("padaria")) {
            departamento = "03";
            return  completarComZeroDireita(2,departamento);
        } else if(this.produto.getDepartamento().equalsIgnoreCase("açougue")) {
            departamento = "02";
            return completarComZeroDireita(2,departamento);
        } else {
            departamento = "01";
            return  completarComZeroDireita(2,departamento);
        }
    }

    private String montarTipoEtiqueta() {
        String tipoEtiqueta;
        if(this.produto.getUnidadeMedida().equalsIgnoreCase("un")) {
            tipoEtiqueta = "1";
            return tipoEtiqueta;
        } else {
            tipoEtiqueta = "0";
            return tipoEtiqueta;
        }
    }

    private String montarTipoEtiquetaTxItem() {
        String tipoEtiqueta;
        if(this.produto.getUnidadeMedida().equalsIgnoreCase("un")) {
            tipoEtiqueta = "01";
            return tipoEtiqueta;
        } else {
            tipoEtiqueta = "00";
            return tipoEtiqueta;
        }
    }

    private String montarCodigoEan() {
        String novoCodigoEan;
        if (this.produto.getEan().length() > 6) {
            novoCodigoEan = this.produto.getEan().substring(0, 5);
            return completarComZeroDireita(6, novoCodigoEan);
        } else {
            return completarComZeroDireita(6, this.produto.getEan());
        }
    }

    private String montarPreco() {
        String precoConvertido = this.produto.getPrecoVenda().toString().replace(".", "");
        String novoPreco;
        if (precoConvertido.length() > 6) {
            novoPreco = precoConvertido.substring(0, 5);
            return completarComZeroDireita(6, novoPreco);
        } else {
            return completarComZeroDireita(6, precoConvertido);
        }
    }

    private String montarValidade() {
        String validade;
        if(this.produto.getValidade().length() > 3) {
            validade = this.produto.getValidade().substring(0,2);
            return completarComZeroDireita(3,validade);
        } else {
            return completarComZeroDireita(3,this.produto.getValidade());
        }
    }

    private String montarDescricao() {
        String novaDescricao;
        if (this.produto.getDescricao().length() > 50) {
            novaDescricao = this.produto.getDescricao().substring(0, 49);
            return completarComEspacoDireita(50, novaDescricao);
        } else {
            return completarComEspacoDireita(50, this.produto.getDescricao());
        }
    }

    //INFNUTRI.TXT
    private String montarCodigoNutricional() {
        String novoCodigo;
        if (Integer.toString(this.nutricional.getCodNutri()).length() > 6) {
            novoCodigo = Integer.toString(this.nutricional.getCodNutri()).substring(0, 5);
            return completarComZeroDireita(6, novoCodigo);
        } else {
            return completarComZeroDireita(6, Integer.toString(this.nutricional.getCodNutri()));
        }
    }

    private String montarQuantidadePorcao() {
        String quantidadeConvertida = this.nutricional.getQuantidadePorPorcao().toString().replace(".","");
        String novaQuantidade;
        if(quantidadeConvertida.length() > 3) {
            novaQuantidade = quantidadeConvertida.substring(0,2);
            return completarComZeroDireita(3,novaQuantidade);
        } else {
            return completarComZeroDireita(3,quantidadeConvertida);
        }
    }

    private String montarUnidadePorcao() { return "0"; }

    private String montarMedidaCaseiraInteira() {
        return "00";
    }

    private String montarMedidaCaseiraDecimal() {
        return "0";
    }

    private String montarMedidaCaseiraUtilizada() {
        return "00";
    }

    private String montarValorEnergetico() {
        String valorEnergeticoConvertido = this.nutricional.getValorCalorico().toString().replace(".","");
        String novoValorEnergetico;
        if(valorEnergeticoConvertido.length() > 4) {
            novoValorEnergetico = valorEnergeticoConvertido.substring(0,3);
            return completarComZeroDireita(4,novoValorEnergetico);
        } else {
            return completarComZeroDireita(4,valorEnergeticoConvertido);
        }
    }

    private String montarCarboidrato() {
        String carboidratoConvertido = this.nutricional.getValorCarboidratos().toString();
        int pos = carboidratoConvertido.indexOf(".");
        String novoCarboidrato;
        if(carboidratoConvertido.length() > 4) {
            novoCarboidrato = carboidratoConvertido.substring(0,pos);
            return completarComZeroDireita(3,novoCarboidrato);
        } else {
            return completarComZeroDireita(3,carboidratoConvertido);
        }
    }

    private String montarProteina() {
        String proteinaConvertida = this.nutricional.getValorProteinas().toString().replace(".","");
        String novoProteina;
        if(proteinaConvertida.length() > 3) {
            novoProteina = proteinaConvertida.substring(0,2);
            return completarComZeroDireita(3,novoProteina);
        } else {
            return completarComZeroDireita(3,proteinaConvertida);
        }
    }

    private String montarGorduraTotal() {
        String gorduraTotalConvertida = this.nutricional.getValorGorduraTotal().toString().replace(".","");
        String novoGorduraTotal;
        if(gorduraTotalConvertida.length() > 3) {
            novoGorduraTotal = gorduraTotalConvertida.substring(0,2);
            return completarComZeroDireita(3,novoGorduraTotal);
        } else {
            return completarComZeroDireita(3,gorduraTotalConvertida);
        }
    }

    private String montarGorduraSaturada() {
        String gorduraSaturadaConvertida = this.nutricional.getValorGorduraSaturada().toString().replace(".","");
        String novoGorduraSaturada;
        if(gorduraSaturadaConvertida.length() > 3) {
            novoGorduraSaturada = gorduraSaturadaConvertida.substring(0,2);
            return completarComZeroDireita(3,novoGorduraSaturada);
        } else {
            return completarComZeroDireita(3,gorduraSaturadaConvertida);
        }
    }

    private String montarGorduraTrans() {
        String gorduraTransConvertida = this.nutricional.getValorGorduraTrans().toString().replace(".","");
        String novoGorduraTrans;
        if(gorduraTransConvertida.length() > 3) {
            novoGorduraTrans = gorduraTransConvertida.substring(0,2);
            return completarComZeroDireita(3,novoGorduraTrans);
        } else {
            return completarComZeroDireita(3,gorduraTransConvertida);
        }
    }

    private String montarFibra() {
        String fibraConvertida = this.nutricional.getValorFibra().toString().replace(".","");
        String novoFibra;
        if(fibraConvertida.length() > 3) {
            novoFibra = fibraConvertida.substring(0,2);
            return completarComZeroDireita(3,novoFibra);
        } else {
            return completarComZeroDireita(3,fibraConvertida);
        }
    }

    private String montarSodio() {
        String sodioConvertido = this.nutricional.getValorSodio().toString();
        int pos = sodioConvertido.indexOf(".");
        String novoSodio;
        if(sodioConvertido.length() > 5) {
            novoSodio = sodioConvertido.substring(0,pos);
            return  completarComZeroDireita(4,novoSodio);
        } else {
            return completarComZeroDireita(4,sodioConvertido);
        }
    }

//    //TXINFO.TXT
//    private String montarCodigoInformacaoExtra(){
//
//    }
//    private String montarObservacao(){
//
//    }
//    private String montarInformacaoExtra(){
//
//    }

    //montar linhas do .TXT
    public String montarItensMGV() {
        String linha = montarDepartamento() + montarTipoEtiqueta() + montarCodigoEan() + montarPreco() + montarValidade() + montarDescricao() + completarComZeroDireita(88, "") + "\r\n";
        return linha;
    }

    public String montarTxItem() {
        String linha = montarDepartamento() + montarTipoEtiquetaTxItem() + montarTipoEtiqueta() + montarCodigoEan() + montarPreco() + montarValidade() + montarDescricao() +"\r\n";
        return linha;
    }

    public String montarInfNutri() {
        String linha = "N"+ montarCodigoNutricional() + "0" + montarQuantidadePorcao() + montarUnidadePorcao() + montarMedidaCaseiraInteira() +
                montarMedidaCaseiraDecimal() + montarMedidaCaseiraUtilizada() + montarValorEnergetico() + montarCarboidrato() + "0" +
                montarProteina() + montarGorduraTotal() + montarGorduraSaturada() + montarGorduraTrans() + montarFibra() + montarSodio() + "0" + "\r\n";
        return linha;
    }

//    public String montarTxInfo(){
//        String linha = montarCodigoInformacaoExtra() + montarObservacao() + montarInformacaoExtra() +"\r\n";
//        return linha;
//    }
}
