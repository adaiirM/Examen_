package Tienda;

import Productos.Electronica;
import Productos.Farmacia;
import Productos.Producto;

import java.util.Scanner;

public class Main {
    int opc;
    String producto;
    public static void main(String[] args) {
        Producto p1 = new Electronica("refri", "Sony", 10000, "Cocina");
        Producto p2 = new Farmacia("Paracetamol", "duplix", 60, "6 tabletas", "5mlg");
        Tienda catalogo = new Tienda();
        CarritoCompras carrito =new CarritoCompras();
        String pro;
        int opcion;

        catalogo.agregarACatalogo(p1);
        catalogo.agregarACatalogo(p2);

        Scanner opc =new Scanner(System.in);
        Scanner producto = new Scanner(System.in);

        do{
            System.out.println("*****Menú*****");
            System.out.println("***** 1. Ver catalogo *****");
            System.out.println("***** 2. Agregar producto al carrito *****");
            System.out.println("***** 3. Eliminar producto del carrito *****");
            System.out.println("***** 4. Ver carrito de compras *****");
            System.out.println("***** 5. Realizar compra del carrito *****");
            opcion = opc.nextInt();
            switch(opcion) {
                case 1:
                    catalogo.mostrarProducto();
                    break;
                case 2:
                    System.out.println("Escriba el nombre del producto a agregar: ");
                    pro = producto.next();
                    System.out.println("Escriba la cantidad del producto: ");
                    int cantidad = opc.nextInt();
                    for(Producto p:catalogo.getCatalogo()){
                        if(pro.equals(p.getNombrePrducto())){
                            carrito.agregarProducto(p);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el producto que deseas eliminar: ");
                    pro = producto.next();
                    carrito.eliminarProducto(pro);
                    break;
                case 4:
                    carrito.mostrarProducto();
                default:
                    break;

            }
        }while (opcion != 5);
    }
}
