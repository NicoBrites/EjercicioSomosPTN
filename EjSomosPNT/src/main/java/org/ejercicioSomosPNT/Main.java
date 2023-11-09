package org.ejercicioSomosPNT;
import org.ejercicioSomosPNT.Models.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Producto> lista = CrearLista();

        ProductoValor productoValor = new ProductoValor();
        int precioAnterior = 0;
        for (Producto producto : lista) {
            System.out.println(producto.toString());
            if (producto.compareTo(precioAnterior) > 0)
            {
                productoValor.setProductoCaro(producto.getNombre());
                precioAnterior = producto.getPrecio();
            } else  {
                productoValor.setProductoBarato(producto.getNombre());
                precioAnterior = producto.getPrecio();
            }
        }
        System.out.println(productoValor.toString());

    }
    public static List<Producto> CrearLista(){
        List<Producto> listaProductos = new ArrayList<>() ;
        listaProductos.add(new Bebida(1.5f,"Coca-Cola Zero",20));
        listaProductos.add(new Bebida(1.5f,"Coca-Cola",18));
        listaProductos.add(new Shampoo(500,"Shampoo Sedal",19));
        listaProductos.add(new Fruta("kilo","Frutillas",64));

        return listaProductos;
    }
}