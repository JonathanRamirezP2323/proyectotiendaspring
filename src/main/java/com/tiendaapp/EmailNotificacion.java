package com.tiendaapp;

public class EmailNotificacion implements NotificacionService{
    @Override
    public void enviar(String mensaje){
        System.out.println("[jonathanr@gmail.com]"+ mensaje);
    }
}
