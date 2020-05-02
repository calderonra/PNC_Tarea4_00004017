package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {


    @Size(min=1,max = 12, message = "El campo codigo debe tener una longitud entre 1 y 12 digitos.")
    String codigoProducto;


    @Size(min=1,max = 100, message = "El campo Nombre Producto debe tener una longitud entre 1 y 100 caracteres.")
    String nombreProducto;

    @Size(min=1,max = 100, message = "El campo Nombre marca debe tener una longitud entre 1 y 100 caracteres.")
    String marca;

    @Size(min=1,max = 500, message = "El campo descripcion debe tener una longitud entre 1 y 500 caracteres.")
    String descripcion;

    int existencias;

    @Pattern(regexp ="^\\d{2}/\\d{2}/\\d{4}$", message="Fecha mal ingresada")
    String fecha;



    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
