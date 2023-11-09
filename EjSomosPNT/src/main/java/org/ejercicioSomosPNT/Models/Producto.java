package org.ejercicioSomosPNT.Models;

public class Producto implements  Comparable<Integer> {
    private String nombre;
    private int precio;

    public Producto(){
    }
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }

    @Override
    public int compareTo(Integer precioAnterior) {
        return Integer.compare(this.precio, precioAnterior);
    }
}
