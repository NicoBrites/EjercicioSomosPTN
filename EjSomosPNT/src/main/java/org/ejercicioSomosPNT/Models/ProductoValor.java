package org.ejercicioSomosPNT.Models;

public class ProductoValor {
    private String productoCaro;
    private String productoBarato;
    public ProductoValor(){
    }

    public String getProductoCaro(){
        return productoCaro;
    }
    public void setProductoCaro(String productoCaro){
        this.productoCaro = productoCaro;
    }
    public String getProductoBarato(){
        return productoBarato;
    }
    public void setProductoBarato(String productoBarato){
        this.productoBarato = productoBarato;
    }
    @Override
    public String toString() {
        return "=============================\n" +
                "Producto más caro: " + getProductoCaro() + "\n" +
                "Producto más barato: " + getProductoBarato();
    }

}
