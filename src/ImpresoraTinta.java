public class ImpresoraTinta extends Impresor{
    int nivelCartuchoColor;
    int nivelCartuchoNegro;

    public ImpresoraTinta(int nivelCartuchoColor, int nivelCartuchoNegro, String resolucion, String modelo){
        super(modelo, resolucion);
        this.nivelCartuchoColor = nivelCartuchoColor;
        this.nivelCartuchoNegro = nivelCartuchoNegro;
    }

    public void imprimirDocumento(String documento){
        if(nivelCartuchoColor <= 0 && nivelCartuchoNegro <= 0){
            System.out.println("ERROR. No se puede imprimir. Nivel de tinta bajo.");
            return;
        }

        System.out.println("Impresora modelo " + modelo + " inyectando tinta de alta calidad");
        System.out.println("Documento : " + documento);
        System.out.println("Resolución utilizada: " + resolucion);

        this.nivelCartuchoNegro -= 5;
        this.nivelCartuchoColor -= 5;
        System.out.println("Nivel de tinta de color restante: " + nivelCartuchoColor);
        System.out.println("Nivel de tinta negra restante: " + nivelCartuchoNegro);

    }
}
