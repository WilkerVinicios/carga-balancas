import exporter.ExportarFilizola;
import exporter.ExportarToledo;

public class Main {
    public static void main(String[] args) {
        //Filizola
        ExportarFilizola.exportarCad();
        ExportarFilizola.exportarSetor();

        // Toledo
        ExportarToledo.exportarItensMGV();
        ExportarToledo.exportarTxItem();
        //ExportarToledo.exportarTxInfo();
        ExportarToledo.exportarInfNutri();
    }
}
