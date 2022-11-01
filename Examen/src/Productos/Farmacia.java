package Productos;

public class Farmacia extends Producto{
    private String contenido;
    private String conectracionQuimica;

    public Farmacia(String nombrePrducto, String marca, double precio, String contenido, String conectracionQuimica) {
        super(nombrePrducto, marca, precio);
        this.contenido = contenido;
        this.conectracionQuimica = conectracionQuimica;
    }

    @Override
    public String toString() {
        return super.toString()+ "Contenido: "+contenido +"Concentracion quimica:"+ conectracionQuimica;
    }
}
