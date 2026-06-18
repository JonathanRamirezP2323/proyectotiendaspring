package com.tiendaapp;

public class PedidoService {
    private final NotificacionService notif;
    public PedidoService(NotificacionService notif){
        this.notif = notif;
    }
    public void crearPedido(String producto){
        System.out.println("Pedido creado: "+ producto);
        notif.enviar("Nuevo pedido:"+ producto);
    }
}
