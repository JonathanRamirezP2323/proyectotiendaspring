package com.tiendaapp;

public class WhatsappNotificacion implements NotificacionService {

    private String codigoPais;
    private String numeroBase;

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setNumeroBase(String numeroBase) {
        this.numeroBase = numeroBase;
    }

    public void conectar() {
        System.out.println("[WHATSAPP] Conectar al servidor (código:" +codigoPais + ")");
    }

    public void desconectar() {
        System.out.println("[WHATSAPP] Desconectado del servidor");
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[WHATSAPP +593-"+numeroBase+"] mensaje");
    }
}
