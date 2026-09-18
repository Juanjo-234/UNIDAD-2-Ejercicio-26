public class ImpresoraLaser extends Impresor{
    int nivelTonerPorcentaje;

    public ImpresoraLaser(String modelo, String resolcuion, int nivelTonerPorcentaje){
        super(modelo, resolcuion);
        this.nivelTonerPorcentaje = nivelTonerPorcentaje;
    }

    public void imprimirDocumento(String documento){
        if(nivelTonerPorcentaje <= 0){
            System.out.println("El tóner estan bajo, no se puede imprimir.");
            return;
        }
        System.out.println("Impresora laser modelo " + modelo + "imprimiendo documento con alta velocidad");
        System.out.println("Documento: " + documento);
        System.out.println("Resolución: " + resolucion);

        nivelTonerPorcentaje -= 5;
        System.out.println("Nivel de tóner restante: " + nivelTonerPorcentaje);
    }
    public int getNivelTonerPorcentaje() {
        return nivelTonerPorcentaje;
    }
}
