package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "nombre", nullable = false,length = 30)
    private String nombre;

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
