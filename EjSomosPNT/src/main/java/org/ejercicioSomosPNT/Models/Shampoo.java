package org.ejercicioSomosPNT.Models;

public class Shampoo extends Producto {

    private int contenido;

    public Shampoo(int contenido, String nombre, int precio){
        super(nombre,precio);
        this.contenido = contenido;
    }
    public int getContenido(){
        return contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + " /// Precio: $" + getPrecio();
    }
}
