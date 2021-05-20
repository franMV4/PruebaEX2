package com.SanValero;


public class Ordenador {

    private String marca;
    private String modelo;
    private int idReparacion;
    private String causa;
    private boolean reparado;
    private String marcaPiezas;


    public Ordenador(String marca, String modelo, int idReparacion, String causa, boolean reparado, String marcaPiezas) {
        this.marca = marca;
        this.modelo = modelo;
        this.idReparacion = idReparacion;
        this.causa = causa;
        this.reparado = reparado;
        this.marcaPiezas = marcaPiezas;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public boolean getReparado() {
        return reparado;
    }

    public void setReparado(boolean reparado) {
        this.reparado = reparado;
    }

    public String getMarcaPiezas() {
        return marcaPiezas;
    }

    public void setMarcaPiezas(String marcaPiezas) {
        this.marcaPiezas = marcaPiezas;
    }


    public void piezasMarcaIguales(){

        if(marca.equals(marcaPiezas)) {
            System.out.println("Las piezas son de la misma marca que la del ordenador");
        }else{
            System.out.println("Las piezas no son de la misma marca que la del ordenador");
        }}



}