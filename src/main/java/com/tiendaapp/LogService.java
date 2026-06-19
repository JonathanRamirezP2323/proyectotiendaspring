package com.tiendaapp;

public class LogService {

    // Se ejecuta UNA VEZ al arrancar el contexto
    public void iniciar() {
        System.out.println(
            "[LOG] === Sistema de los logs iniciado ===");
    }

    // Método normal - lo usa la apliación durante su vida
    public void registrar(String evento) {
        System.out.println("[LOG] " + evento);
    }

    // Se ejecuta UNA VEZ al cerrar el contexto (ctx.close)
    public void cerrar() {
        System.out.println(
            "[LOG] === Sistema de logs cerrado ===");
    }
}
