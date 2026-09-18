public abstract class Impresor {
    String modelo;
    String resolucion;

    public Impresor(String modelo, String resolucion){
        this.modelo = modelo;
        this.resolucion = resolucion;
    }

   public abstract void imprimirDocumento(String documento);

    public String getModelo() {
        return modelo;
    }

    public String getResolucion() {
        return resolucion;
    }
}
