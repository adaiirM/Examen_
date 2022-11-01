package Productos;

public class AlimentosBebidas extends Producto{
    private String contenido;

    public AlimentosBebidas(String nombrePrducto, String marca, double precio, String contenido) {
        super(nombrePrducto, marca, precio);
        this.contenido = contenido;
    }

}
