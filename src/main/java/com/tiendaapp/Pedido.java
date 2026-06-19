package com.tiendaapp;

public class Pedido {

    private String producto;
    private long timestamp;

    public Pedido() {
        this.timestamp = System.currentTimeMillis();
        System.out.println(
            "  → Nuevo Pedido creado [" + timestamp + "]");
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }

    public long getTimestamp() {
        return timestamp;
    }
}