package org.ejercicioSomosPNT.Models;

public class Fruta extends Producto
{
    private String unidadVenta;

    public Fruta(String unidadVenta, String nombre, int precio){
        super(nombre,precio);
        this.unidadVenta = unidadVenta;
    }
    public String getUnidadVenta(){
        return unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $"
                + getPrecio() + " /// Unidad de venta: " + getUnidadVenta();
    }
}
