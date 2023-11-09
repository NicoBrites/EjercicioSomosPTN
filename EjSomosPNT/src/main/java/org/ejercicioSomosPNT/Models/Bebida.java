package org.ejercicioSomosPNT.Models;

public class Bebida extends Producto {

    private float litros;
    public Bebida(float litros, String nombre, int precio){
        super(nombre,precio);
        this.litros = litros;
    }
    public float getLitros(){
        return litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: $" + getPrecio();
    }
}
