package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipoPrenda", nullable = false)
    private Integer id_tipoPrenda;
    @Column(name = "nombre", nullable = false,length = 30)
    private String nombre;// no vacio solo letras y espacios long 80

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id_tipoPrenda = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id_tipoPrenda;
    }

    public void setId(Integer id) {
        this.id_tipoPrenda = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
