package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = " id_marca", nullable = false)
    private Integer id_marca;
    @Column(name = "nombreMarca", nullable = false,length = 30)
    private String nombreMarca;// no vacio y maximo 50 caracteres con espacios
    @Column(name = "nit", nullable = false,length = 30)
    private String nit;// no vacio solo numeros long max 10
    @Column(name = "anoCreacion", nullable = false)
    private String anoCreacion;// obligatorio
    @Column(name = "sedePrincipal", nullable = false,length = 30)
    private String sedePrincipal;// no se valida

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, String anoCreacion, String sedePrincipal) {
        this.id_marca = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }

    public Integer getId() {
        return id_marca;
    }

    public void setId(Integer id) {
        this.id_marca = id;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(String anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public String getSedePrincipal() {
        return sedePrincipal;
    }

    public void setSedePrincipal(String sedePrincipal) {
        this.sedePrincipal = sedePrincipal;
    }
}
