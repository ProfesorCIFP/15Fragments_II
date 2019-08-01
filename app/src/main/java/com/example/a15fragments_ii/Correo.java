package com.example.a15fragments_ii;

public class Correo {
    private String de;
    private String asunto;
    private String contenido;

    public Correo(String de, String asunto, String contenido) {
        this.de = de;
        this.asunto = asunto;
        this.contenido = contenido;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
