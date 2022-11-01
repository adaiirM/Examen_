package Tienda;

import Productos.Producto;

import java.util.ArrayList;

public class CarritoCompras implements IMetodo{
    ArrayList<Producto> producto;

    public CarritoCompras() {
        this.producto = new ArrayList<>();
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void agregarProducto(Producto p){
        producto.add(p);
    }

    public void mostrarProducto(){
        for(Producto p: getProducto()){
            System.out.println("Producto:"+ p);
        }
    }

    public void eliminarProducto(String nombre){
        for(Producto p: getProducto()){
            if(nombre.equals(p.getNombrePrducto())){
                producto.remove(p);
            }
        }
    }


}
