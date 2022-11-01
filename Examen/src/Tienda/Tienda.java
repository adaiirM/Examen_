package Tienda;

import Productos.Producto;

import java.util.ArrayList;

public class Tienda implements IMetodo{
    ArrayList<Producto> catalogo;

    public Tienda(){
        catalogo = new ArrayList<>();
    }

    public void agregarACatalogo(Producto p){
        catalogo.add(p);
    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void mostrarProducto(){
        for(Producto p: getCatalogo()){
            System.out.println("Producto:"+ p);
        }

    }


}
