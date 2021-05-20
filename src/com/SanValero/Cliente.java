package com.SanValero;

public class Cliente {


    private String nombre;
    private String direccion;
    private int idCliente;
    private boolean pagoTarjeta;
    private String nombreTarjeta;

    public Cliente(String nombre, String direccion, int idCliente, boolean pagoTarjeta, String nombreTarjeta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.idCliente = idCliente;
        this.pagoTarjeta = pagoTarjeta;
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean getPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setPagoTarjeta(boolean pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta){this.nombreTarjeta = nombreTarjeta;}

    public String getNombreTarjeta(){return nombreTarjeta;}

    public void nombresIguales(){

        if(nombre.equals(nombreTarjeta)) {
            System.out.println("El cliente es el propietario de la tarjeta");
        }else{
            System.out.println("El cliente no es el propietario de la tarjeta");
        }}



}

