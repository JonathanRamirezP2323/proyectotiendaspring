package com.tiendaapp;

public class SmsNotificacion implements NotificacionService{
    @Override
    public void enviar(String mensaje) {
        System.out.println("[SMS]"+ mensaje);
    }
}
