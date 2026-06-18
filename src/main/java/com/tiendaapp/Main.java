package com.tiendaapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support
        .ClassPathXmlApplicationContext;

public class Main {
    public  static void main(String[] args) {

        // 1. Carga el contenedor desde el XML
        ApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // 2. Pide al contenedor el Bean que necesitas
        PedidoService svc =
            ctx.getBean(PedidoService.class);

        // 3. Úsalo igual que antes - Spring ya lo conectó
        svc.crearPedido("Laptop Lenovo");
        svc.crearPedido("Mouse inalámbrico");
    }
}
