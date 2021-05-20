package com.SanValero;

public class Empleado {

    private String nombre;
    private String dni;
    private int idEmpleado;
    private boolean enPracticas;
    private String DniTarjetaPago;


    public Empleado(String nombre, String dni, int idEmpleado, boolean enPracticas, String DniTarjetaPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.idEmpleado = idEmpleado;
        this.enPracticas = enPracticas;
        this.DniTarjetaPago = DniTarjetaPago;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public boolean getEnPracticas() {
        return enPracticas;
    }

    public void setEnPracticas(boolean enPracticas) {
        this.enPracticas = enPracticas;
    }

    public String getDniTarjetaPago() {
        return DniTarjetaPago;
    }

    public void setDniTarjetaPago(String dniTarjetaPago) {
        DniTarjetaPago = dniTarjetaPago;
    }


    public void DniAsociadosTarjeta(){

        if(dni.equals(DniTarjetaPago)) {
            System.out.println("El trabajador cobra en su cuenta propia");
        }else{
            System.out.println("El trabajador no cobra en su cuenta propia");
        }}





}
