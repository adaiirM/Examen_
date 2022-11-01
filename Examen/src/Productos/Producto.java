package Productos;

public abstract class Producto {
    private String nombrePrducto;
    private String marca;
    private double precio;

    public Producto(String nombrePrducto, String marca, double precio) {
        this.nombrePrducto = nombrePrducto;
        this.marca = marca;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto:" +
                "nombrePrducto='" + nombrePrducto + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio ;
    }


    public String getNombrePrducto() {
        return nombrePrducto;
    }

    public void setNombrePrducto(String nombrePrducto) {
        this.nombrePrducto = nombrePrducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
