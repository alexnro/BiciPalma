package org.lasencinas.tarjetaUsuario;

public class TarjetaUsuario {

    private String id = null;
    private Boolean activada = false;

    public TarjetaUsuario(String id, Boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getActivada() {
        return this.activada;
    }

    private void setActivada(Boolean activada) {
        this.activada = activada;
    }

}
