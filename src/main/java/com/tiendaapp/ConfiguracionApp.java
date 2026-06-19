package com.tiendaapp;

public class ConfiguracionApp {

    private String nombreEmpresa;
    private String version;
    private boolean modoDebug;

    // SETTERS necesarios para property injection
    public void setNombreEmpresa(String n) {
        this.nombreEmpresa = n;
    }
    public void setVersion(String v) {
        this.version = v;
    }
    public void setModoDebug(boolean d) {
        this.modoDebug = d;
    }

    public void mostrarConfig() {
        System.out.println("=== " + nombreEmpresa +
            " v" + version + " (debug=" + modoDebug + ") ===");
    }
}
