package com.tiendaapp;

import org.springframework.context.support
        .ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx =
        new ClassPathXmlApplicationContext(
            "applicationcontext.xml");

    // 1. Verificar property injection
    ConfiguracionApp cfg = ctx.getBean(ConfiguracionApp.class);
    cfg.mostrarConfig();

    // 2. Demostrar SINGLETON: mismas referencias
    LogService log1 = ctx.getBean(LogService.class);
    LogService log2 = ctx.getBean(LogService.class);
    System.out.println("¿log1 == log2? " + (log1 == log2));
    log1.registrar("Aplicación iniciada");

    // 3. Demostrar PROTOTYPE: referencias distintas
    Pedido p1 = ctx.getBean(Pedido.class); p1.setProducto("Laptop");
    Pedido p2 = ctx.getBean(Pedido.class); p2.setProducto("Mouse");
    System.out.println("¿p1 == p2? " + (p1 == p2));
    System.out.println("p1: " + p1.getProducto());
    System.out.println("p2: " + p2.getProducto());

    NotificacionService whatsApp = ctx.getBean("notificacionWhatsApp", NotificacionService.class);
    PedidoService svcWhatsApp = new PedidoService(whatsApp);
    svcWhatsApp.crearPedido("Tablet Samsung");

    // 4.Cerrar contexto → dispara destroy-method
    ctx.close();
  }
}