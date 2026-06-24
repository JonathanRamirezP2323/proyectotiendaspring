package com.tiendaapp;

public class WhatsappNotificacion {

    private String codigoPais;
    private String numeroBase;

    public void setCodigoPais(String p) {
        this.codigoPais = p;
    }

    public void setNumeroBase(String b) {
        this.numeroBase = b;
    }

    public void conectar() {
        System.out.println("[WHATSAPP] Conectado al servidor (código: +593)");
    }

    public void desconectar() {
        System.out.println("[WHATSAPP] Desconectado del servidor");
    }
    public void enviar(String mensaje) {
        System.out.println("[WHATSAPP +593-0991234567] mensaje");
    }
}
